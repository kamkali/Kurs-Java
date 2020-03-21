package com.course.task.flights.models.response.flight;

import java.time.LocalDateTime;

public class FlightEntityResponseDto {
    private Long id;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int seatCapacity;
    private double ticketPrice;

    public FlightEntityResponseDto(Long id, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, int seatCapacity, double ticketPrice) {
        this.id = id;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatCapacity = seatCapacity;
        this.ticketPrice = ticketPrice;
    }

    public FlightEntityResponseDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
