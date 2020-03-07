package com.kurs.moviestorage.dto;


public class MovieCreationDto {
    private Long genre;
    private String date;
    private String title;

    public MovieCreationDto() {
    }

    public MovieCreationDto(Long genre, String date, String title) {
        this.genre = genre;
        this.date = date;
        this.title = title;
    }

    public Long getGenre() {
        return genre;
    }

    public void setGenre(Long genre) {
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
