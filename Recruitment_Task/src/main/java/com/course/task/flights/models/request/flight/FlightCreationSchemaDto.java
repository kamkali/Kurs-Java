package com.course.task.flights.models.request.flight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlightCreationSchemaDto {
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private int seatCapacity;
    private float ticketPrice;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public FlightCreationSchemaDto(String departureDate, String arrivalDate, int seatCapacity, float ticketPrice) {
        this.departureDate = LocalDateTime.parse(departureDate, formatter);
        this.arrivalDate = LocalDateTime.parse(arrivalDate, formatter);
        this.seatCapacity = seatCapacity;
        this.ticketPrice = ticketPrice;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }
}
