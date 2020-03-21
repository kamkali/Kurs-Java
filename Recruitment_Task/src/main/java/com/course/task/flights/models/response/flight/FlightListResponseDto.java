package com.course.task.flights.models.response.flight;

import com.course.task.flights.models.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FlightListResponseDto extends Response {
    List<FlightBodyResponseDto> flightList;

    @Autowired
    public FlightListResponseDto(MessageType type, String message, List<FlightBodyResponseDto> flightList) {
        super(type, message);
        this.flightList = flightList;
    }

    public List<FlightBodyResponseDto> getFlightList() {
        return flightList;
    }
}
