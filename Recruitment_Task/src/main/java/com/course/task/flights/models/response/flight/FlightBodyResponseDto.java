package com.course.task.flights.models.response.flight;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.tourist.TouristEntityResponseDto;
import com.course.task.flights.tourist.TouristEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightBodyResponseDto {
    private Long id;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int seatCapacity;
    private double ticketPrice;
    private List<TouristEntityResponseDto> touristList;

    public FlightBodyResponseDto(FlightEntity flightEntity) {
        this.id = flightEntity.getId();
        this.departureDateTime = flightEntity.getDepartureDateTime();
        this.arrivalDateTime = flightEntity.getArrivalDateTime();
        this.seatCapacity = flightEntity.getSeatCapacity();
        this.ticketPrice = flightEntity.getTicketPrice();
        this.touristList = setTouristList(flightEntity);
    }

    private List<TouristEntityResponseDto> setTouristList(FlightEntity flightEntity) {
        List<TouristEntityResponseDto> list = new ArrayList<>();
        for (TouristEntity t : flightEntity.getTouristList()){
            TouristEntityResponseDto touristDto = new TouristEntityResponseDto(t.getId(), t.getFirstName(), t.getLastName(),
                    t.getSex(), t.getCountry(), t.getBirthDate());
            list.add(touristDto);
        }
        return list;
    }

    public FlightBodyResponseDto() {
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

    public List<TouristEntityResponseDto> getTouristList() {
        return touristList;
    }

    public void setTouristList(List<TouristEntityResponseDto> touristList) {
        this.touristList = touristList;
    }
}
