package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;
import com.course.task.flights.tourist.TouristEntity;

import java.util.List;

public class TouristListResponseDto extends Response {
    private List<TouristEntity> tourist;

    public TouristListResponseDto(MessageType type, String message, List<TouristEntity> tourist) {
        super(type, message);
        this.tourist = tourist;
    }

    public TouristListResponseDto(MessageType type, String message) {
        super(type, message);
    }

    public List<TouristEntity> getTourist() {
        return tourist;
    }

    public void setTourist(List<TouristEntity> tourist) {
        this.tourist = tourist;
    }
}
