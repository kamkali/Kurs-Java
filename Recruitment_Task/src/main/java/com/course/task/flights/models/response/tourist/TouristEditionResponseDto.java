package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;

public class TouristEditionResponseDto extends Response {
    private TouristBodyResponseDto touristEntity;

    public TouristEditionResponseDto(MessageType type, String message, TouristBodyResponseDto touristEntity) {
        super(type, message);
        this.touristEntity = touristEntity;
    }

    public TouristBodyResponseDto getTouristEntity() {
        return touristEntity;
    }

    public void setTouristEntity(TouristBodyResponseDto touristEntity) {
        this.touristEntity = touristEntity;
    }
}
