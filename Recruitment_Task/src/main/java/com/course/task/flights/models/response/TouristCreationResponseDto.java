package com.course.task.flights.models.response;


import com.course.task.flights.tourist.TouristEntity;

public class TouristCreationResponseDto extends Response{
    private TouristEntity tourist;

    public TouristCreationResponseDto(MessageType type, String message, TouristEntity tourist) {
        super(type, message);
        this.tourist = tourist;
    }

}
