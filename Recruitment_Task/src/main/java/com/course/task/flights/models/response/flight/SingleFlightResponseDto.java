package com.course.task.flights.models.response.flight;

import com.course.task.flights.models.response.Response;

public class SingleFlightResponseDto extends Response{
    FlightBodyResponseDto flightEntity;
    public SingleFlightResponseDto(Response.MessageType info, String list_of_flights_shown, FlightBodyResponseDto flight) {
        super(info, list_of_flights_shown);
        this.flightEntity = flight;
    }

    public FlightBodyResponseDto getFlightEntity() {
        return flightEntity;
    }
}
