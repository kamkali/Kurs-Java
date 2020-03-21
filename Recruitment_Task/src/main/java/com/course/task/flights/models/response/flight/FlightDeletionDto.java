package com.course.task.flights.models.response.flight;

import com.course.task.flights.models.response.Response;

public class FlightDeletionDto extends Response {
    public FlightDeletionDto(MessageType type, String message) {
        super(type, message);
    }
}
