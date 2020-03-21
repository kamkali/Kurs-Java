package com.course.task.flights.flight;

import com.course.task.flights.models.request.flight.FlightCreationSchemaDto;
import com.course.task.flights.models.response.Response;
import com.course.task.flights.models.response.flight.FlightCreationResponseDto;
import com.course.task.flights.models.response.flight.FlightListResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private FlightRepository flightRepository;

    @Autowired
    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/all")
    public ResponseEntity getFlightList() {
        List<FlightEntity> flightList = flightRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(
                new FlightListResponseDto(Response.MessageType.INFO, "List of flights shown", flightList));
    }

    @PostMapping("/add")
    public ResponseEntity createFlight(@RequestBody FlightCreationSchemaDto flight) {
        FlightEntity flightToSave = new FlightEntity(flight.getDepartureDate(), flight.getArrivalDate(),
                flight.getSeatCapacity(), flight.getTicketPrice(), Collections.emptyList());

        FlightEntity savedFlight = flightRepository.save(flightToSave);
        flightToSave.setId(savedFlight.getId());

        return ResponseEntity.status(HttpStatus.CREATED).body(new FlightCreationResponseDto(Response.MessageType.INFO,
                "New flight record has been created", flightToSave));
    }
}
