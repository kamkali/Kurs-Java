package com.course.task.flights.flight;

import com.course.task.flights.models.response.Response;
import com.course.task.flights.models.response.flight.FlightListResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
