package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;

public class SingleTouristResponseDto extends Response{
    TouristBodyResponseDto touristEntity;
    public SingleTouristResponseDto(Response.MessageType info, String current_list_of_users, TouristBodyResponseDto tourist) {
        super(info, current_list_of_users);
        this.touristEntity = tourist;
    }

    public TouristBodyResponseDto getTouristEntity() {
        return touristEntity;
    }
}
