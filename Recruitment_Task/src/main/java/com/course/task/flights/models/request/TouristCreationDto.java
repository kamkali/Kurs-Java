package com.course.task.flights.models.request;

import java.time.LocalDate;
import java.util.Date;

public class TouristCreationDto {
    private String firstName;
    private String lastName;
    private String sex;
    private String country;
    private LocalDate birthDate;

    public TouristCreationDto(String firstName, String lastName, String sex, String country, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.country = country;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public TouristCreationDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
