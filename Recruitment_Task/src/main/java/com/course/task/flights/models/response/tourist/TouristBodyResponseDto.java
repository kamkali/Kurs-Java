package com.course.task.flights.models.response.tourist;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.flight.FlightEntityResponseDto;
import com.course.task.flights.tourist.TouristEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TouristBodyResponseDto{
    private Long id;
    private String firstName;
    private String lastName;
    private String sex;
    private String country;
    private LocalDate birthDate;
    private List<FlightEntityResponseDto> flightList;

    public TouristBodyResponseDto(TouristEntity touristEntity) {
        this.id = touristEntity.getId();
        this.firstName = touristEntity.getFirstName();
        this.lastName = touristEntity.getLastName();
        this.sex = touristEntity.getSex();
        this.country = touristEntity.getCountry();
        this.birthDate = touristEntity.getBirthDate();
        this.flightList = setFlightList(touristEntity);
    }

    public TouristBodyResponseDto() {
    }

    private List<FlightEntityResponseDto> setFlightList(TouristEntity touristEntity) {
        List<FlightEntityResponseDto> list = new ArrayList<>();
        for (FlightEntity flight : touristEntity.getFlightList()){
            FlightEntityResponseDto flightDto = new FlightEntityResponseDto(flight.getId(), flight.getDepartureDateTime(),
                    flight.getArrivalDateTime(), flight.getSeatCapacity(), flight.getTicketPrice());
            list.add(flightDto);
        }
        return list;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<FlightEntityResponseDto> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<FlightEntityResponseDto> flightList) {
        this.flightList = flightList;
    }
}
