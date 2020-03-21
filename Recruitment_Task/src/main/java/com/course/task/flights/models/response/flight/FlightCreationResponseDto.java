package com.course.task.flights.models.response.flight;

import com.course.task.flights.models.response.Response;

public class FlightCreationResponseDto extends Response {
    private FlightBodyResponseDto flightEntity;

    public FlightCreationResponseDto(MessageType type, String message, FlightBodyResponseDto flightEntity) {
        super(type, message);
        this.flightEntity = flightEntity;
    }

    public FlightCreationResponseDto(MessageType type, String message) {
        super(type, message);
    }

    public FlightBodyResponseDto getFlightEntity() {
        return flightEntity;
    }
}
