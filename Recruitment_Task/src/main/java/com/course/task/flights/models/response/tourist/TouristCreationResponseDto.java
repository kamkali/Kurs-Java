package com.course.task.flights.models.response.tourist;


import com.course.task.flights.models.response.Response;

public class TouristCreationResponseDto extends Response {
    private TouristBodyResponseDto tourist;

    public TouristCreationResponseDto(MessageType type, String message, TouristBodyResponseDto tourist) {
        super(type, message);
        this.tourist = tourist;
    }

    public TouristBodyResponseDto getTourist() {
        return tourist;
    }

    public void setTourist(TouristBodyResponseDto tourist) {
        this.tourist = tourist;
    }
}
