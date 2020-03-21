package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TouristListResponseDto extends Response {
    private List<TouristBodyResponseDto> tourist;

    @Autowired
    public TouristListResponseDto(MessageType type, String message, List<TouristBodyResponseDto> tourist) {
        super(type, message);
        this.tourist = tourist;
    }

    public TouristListResponseDto(MessageType type, String message) {
        super(type, message);
    }

    public List<TouristBodyResponseDto> getTourist() {
        return tourist;
    }

    public void setTourist(List<TouristBodyResponseDto> tourist) {
        this.tourist = tourist;
    }
}
