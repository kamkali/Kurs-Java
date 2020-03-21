package com.course.task.flights.exception;

public class NotEnoughSeats extends Exception {
    public NotEnoughSeats(String message) {
        super(message);
    }
}
