package com.course.task.flights.tourist;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.request.tourist.TouristCreationDto;
import com.course.task.flights.models.request.tourist.TouristEditionDto;
import com.course.task.flights.models.response.Response;
import com.course.task.flights.models.response.tourist.TouristCreationResponseDto;
import com.course.task.flights.models.response.tourist.TouristDeletionResponseDto;
import com.course.task.flights.models.response.tourist.TouristEditionResponseDto;
import com.course.task.flights.models.response.tourist.TouristListResponseDto;
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
    TouristRepository touristRepository;

    @Autowired
    public TouristController(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @PostMapping("/add")
    public ResponseEntity createTourist(@RequestBody TouristCreationDto tourist){
        TouristEntity touristToSave = new TouristEntity(tourist.getFirstName(), tourist.getLastName(), tourist.getSex(),
                tourist.getCountry(), tourist.getBirthDate(), new ArrayList<FlightEntity>() {});

        TouristEntity savedTourist = touristRepository.save(touristToSave);
        touristToSave.setId(savedTourist.getId());

        return ResponseEntity.status(HttpStatus.CREATED).body(new TouristCreationResponseDto(
                Response.MessageType.INFO, "Tourist has been created successfully", touristToSave));
    }

    @GetMapping("/all")
    public ResponseEntity getTouristsList() {
        List<TouristEntity> touristList = touristRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(new TouristListResponseDto(Response.MessageType.INFO,
                "Current list of users", touristList));
    }

    @PutMapping("/{id}")
    public ResponseEntity editTourist(@PathVariable Long id, @RequestBody TouristEditionDto touristEdit) throws NotFoundException {
        TouristEntity tourist = checkTouristCorrectness(id);

        return ResponseEntity.status(HttpStatus.OK).body(new TouristEditionResponseDto(Response.MessageType.INFO,
                "Tourist has been edited", tourist));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTourist(@PathVariable Long id) throws NotFoundException {
        TouristEntity tourist = checkTouristCorrectness(id);

        touristRepository.delete(tourist);

        return ResponseEntity.status(HttpStatus.OK).body(new TouristDeletionResponseDto(
                Response.MessageType.INFO, "Tourist has been deleted"));
    }

    private TouristEntity checkTouristCorrectness(Long id) throws NotFoundException {
        Optional<TouristEntity> tourist = touristRepository.findById(id);

        if (!tourist.isPresent())
            throw new NotFoundException("Tourist has not been found");

        return tourist.get();
    }
}
