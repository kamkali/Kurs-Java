package com.course.task.flights.models.response.flight;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.Response;

public class FlightCreationResponseDto extends Response {
    private FlightEntity flightEntity;

    public FlightCreationResponseDto(MessageType type, String message, FlightEntity flightEntity) {
        super(type, message);
        this.flightEntity = flightEntity;
    }

    public FlightEntity getFlightEntity() {
        return flightEntity;
    }
}
