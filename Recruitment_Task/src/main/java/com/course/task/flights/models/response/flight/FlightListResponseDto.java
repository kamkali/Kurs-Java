package com.course.task.flights.models.response.flight;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.Response;

import java.util.List;

public class FlightListResponseDto extends Response {
    List<FlightEntity> flightList;

    public FlightListResponseDto(MessageType type, String message, List<FlightEntity> flightList) {
        super(type, message);
        this.flightList = flightList;
    }

    public List<FlightEntity> getFlightList() {
        return flightList;
    }
}
