package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;
import com.course.task.flights.tourist.TouristEntity;

public class TouristEditionResponseDto extends Response {
    private TouristEntity touristEntity;

    public TouristEditionResponseDto(MessageType type, String message, TouristEntity touristEntity) {
        super(type, message);
        this.touristEntity = touristEntity;
    }

    public TouristEntity getTouristEntity() {
        return touristEntity;
    }

    public void setTouristEntity(TouristEntity touristEntity) {
        this.touristEntity = touristEntity;
    }
}
