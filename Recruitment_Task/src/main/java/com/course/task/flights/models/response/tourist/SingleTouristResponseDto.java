package com.course.task.flights.models.response.tourist;

import com.course.task.flights.models.response.Response;
import com.course.task.flights.tourist.TouristEntity;

public class SingleTouristResponseDto extends Response{
    TouristEntity touristEntity;
    public SingleTouristResponseDto(Response.MessageType info, String current_list_of_users, TouristEntity tourist) {
        super(info, current_list_of_users);
        this.touristEntity = tourist;
    }
}
