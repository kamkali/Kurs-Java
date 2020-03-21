package com.course.task.flights.models.response.flight;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.models.response.Response;

public class SingleFlightResponseDto extends Response{
    FlightEntity flightEntity;
    public SingleFlightResponseDto(Response.MessageType info, String list_of_flights_shown, FlightEntity flight) {
        super(info, list_of_flights_shown);
        this.flightEntity = flight;
    }
}
