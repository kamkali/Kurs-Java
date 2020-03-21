package com.course.task.flights.models.response;

import org.springframework.http.HttpStatus;

public class ExceptionResponse extends Response {
    private String description;
    private String status;

    public ExceptionResponse(Response.MessageType type, String message, String description, HttpStatus status) {
        super(type, message);
        this.description = description;
        this.status = status.toString();
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
