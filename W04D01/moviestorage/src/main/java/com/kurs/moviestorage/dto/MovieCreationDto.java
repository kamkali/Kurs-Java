package com.kurs.moviestorage.dto;


import com.kurs.moviestorage.model.Genre;

public class MovieCreationDto {
    private Genre genre;
    private String date;
    private String title;

    public MovieCreationDto() {
    }

    public MovieCreationDto(Genre genre, String date, String title) {
        this.genre = genre;
        this.date = date;
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
