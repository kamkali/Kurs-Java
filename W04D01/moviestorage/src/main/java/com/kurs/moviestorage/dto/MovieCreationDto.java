package com.kurs.moviestorage.dto;


public class MovieCreationDto {
    private String genere;
    private String date;
    private String title;

    public MovieCreationDto() {
    }

    public MovieCreationDto(String genere, String date, String title) {
        this.genere = genere;
        this.date = date;
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
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
