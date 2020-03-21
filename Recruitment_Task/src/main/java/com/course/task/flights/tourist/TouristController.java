package com.course.task.flights.tourist;

import com.course.task.flights.exception.NotEnoughSeats;
import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.flight.FlightRepository;
import com.course.task.flights.models.request.tourist.TouristCreationDto;
import com.course.task.flights.models.request.tourist.TouristEditionDto;
import com.course.task.flights.models.response.Response;
import com.course.task.flights.models.response.tourist.*;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tourists")
public class TouristController {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public TouristController(TouristRepository touristRepository, FlightRepository flightRepository) {
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

    @PostMapping("/add")
    public ResponseEntity createTourist(@RequestBody TouristCreationDto tourist){
        TouristEntity touristToSave = new TouristEntity(tourist.getFirstName(), tourist.getLastName(), tourist.getSex(),
                tourist.getCountry(), tourist.getBirthDate(), new ArrayList<FlightEntity>() {});

        TouristEntity savedTourist = touristRepository.save(touristToSave);
        touristToSave.setId(savedTourist.getId());

        TouristBodyResponseDto bodyResponse = new TouristBodyResponseDto(touristToSave);

        return ResponseEntity.status(HttpStatus.CREATED).body(new TouristCreationResponseDto(
                Response.MessageType.INFO, "Tourist has been created successfully", bodyResponse));
    }

    @GetMapping("/all")
    public ResponseEntity getTouristsList() {
        List<TouristEntity> touristList = touristRepository.findAll();

        List<TouristBodyResponseDto> bodyToReturn = new ArrayList<>();
        for (int i = 0; i < touristList.size(); i++) {
            bodyToReturn.add(i, new TouristBodyResponseDto(touristList.get(i)));
        }

        return ResponseEntity.status(HttpStatus.OK).body(new TouristListResponseDto(Response.MessageType.INFO,
                "Current list of users", bodyToReturn));
    }

    @GetMapping("/{id}")
    public ResponseEntity getTourist(@PathVariable Long id) throws NotFoundException {
        TouristEntity tourist = checkTouristCorrectness(id);

        TouristBodyResponseDto bodyResponse = new TouristBodyResponseDto(tourist);
        return ResponseEntity.status(HttpStatus.OK).body(new SingleTouristResponseDto(Response.MessageType.INFO,
                "User with given id found", bodyResponse));
    }

    @PutMapping("/{id}" + "/flight/add")
    public ResponseEntity addTouristFlight(@PathVariable Long id, @RequestBody TouristEditionDto touristEdit) throws NotFoundException, NotEnoughSeats {
        TouristEntity tourist = checkTouristCorrectness(id);
        FlightEntity flight = checkFlightCorrectness(touristEdit.getFlight());

        checkSeatCapacity(flight);

        if (!tourist.getFlightList().contains(flight)) {
            tourist.getFlightList().add(flight);
            flight.getTouristList().add(tourist);
        }

        touristRepository.save(tourist);
        flightRepository.save(flight);

        TouristBodyResponseDto bodyResponse = new TouristBodyResponseDto(tourist);

        return ResponseEntity.status(HttpStatus.OK).body(new TouristEditionResponseDto(Response.MessageType.INFO,
                "Tourist has been edited", bodyResponse));
    }

    @PutMapping("/{id}" + "/flight/remove")
    public ResponseEntity removeTouristFlight(@PathVariable Long id, @RequestBody TouristEditionDto touristEdit) throws NotFoundException {
        TouristEntity tourist = checkTouristCorrectness(id);
        FlightEntity flight = checkFlightCorrectness(touristEdit.getFlight());

        tourist.getFlightList().remove(flight);

        touristRepository.save(tourist);

        TouristBodyResponseDto bodyResponse = new TouristBodyResponseDto(tourist);

        return ResponseEntity.status(HttpStatus.OK).body(new TouristEditionResponseDto(Response.MessageType.INFO,
                "Tourist has been edited", bodyResponse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTourist(@PathVariable Long id) throws NotFoundException {
        TouristEntity tourist = checkTouristCorrectness(id);

        touristRepository.delete(tourist);

        return ResponseEntity.status(HttpStatus.OK).body(new TouristDeletionResponseDto(
                Response.MessageType.INFO, "Tourist has been deleted"));
    }

    private void checkSeatCapacity(FlightEntity flight) throws NotEnoughSeats {
        if (flight.getTouristList().size() >= flight.getSeatCapacity())
            throw new NotEnoughSeats("There is not enough seats in the flight");
    }

    private FlightEntity checkFlightCorrectness(Long flightId) throws NotFoundException {
        Optional<FlightEntity> flight = flightRepository.findById(flightId);

        if (!flight.isPresent())
            throw new NotFoundException("Flight has not been found");

        return flight.get();
    }


    private TouristEntity checkTouristCorrectness(Long id) throws NotFoundException {
        Optional<TouristEntity> tourist = touristRepository.findById(id);

        if (!tourist.isPresent())
            throw new NotFoundException("Tourist has not been found");

        return tourist.get();
    }
}
