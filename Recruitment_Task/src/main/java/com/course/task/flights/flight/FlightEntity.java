package com.course.task.flights.flight;

import com.course.task.flights.tourist.TouristEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class FlightEntity {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int seatCapacity;
    private double ticketPrice;
    @OneToMany
    private List<TouristEntity> touristList;

    public FlightEntity() {
    }

    public FlightEntity(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, int seatCapacity, double ticketPrice, List<TouristEntity> touristList) {
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatCapacity = seatCapacity;
        this.ticketPrice = ticketPrice;
        this.touristList = touristList;
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

    public List<TouristEntity> getTouristList() {
        return touristList;
    }

    public void setTouristList(List<TouristEntity> touristList) {
        this.touristList = touristList;
    }
}
