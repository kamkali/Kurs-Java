package com.course.task.flights.models.request.tourist;

public class TouristEditionDto {
    private Long flight;

    public TouristEditionDto() {
    }

    public TouristEditionDto(Long flight) {
        this.flight = flight;
    }

    public Long getFlight() {
        return flight;
    }
}
