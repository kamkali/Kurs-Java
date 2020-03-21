package com.course.task.flights.models.response.tourist;


import com.course.task.flights.models.response.Response;
import com.course.task.flights.tourist.TouristEntity;

public class TouristCreationResponseDto extends Response {
    private TouristEntity tourist;

    public TouristCreationResponseDto(MessageType type, String message, TouristEntity tourist) {
        super(type, message);
        this.tourist = tourist;
    }

    public TouristEntity getTourist() {
        return tourist;
    }

    public void setTourist(TouristEntity tourist) {
        this.tourist = tourist;
    }
}
