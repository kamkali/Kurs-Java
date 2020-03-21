package com.course.task.flights.models.response.flight;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.Response;

public class FlightDeletionDto extends Response {
    private FlightEntity flightEntity;
    public FlightDeletionDto(MessageType type, String message, FlightEntity flightEntity) {
        super(type, message);
        this.flightEntity = flightEntity;
    }

    public FlightEntity getFlightEntity() {
        return flightEntity;
    }
}
