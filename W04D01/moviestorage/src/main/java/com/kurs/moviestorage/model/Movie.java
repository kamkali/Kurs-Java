package com.kurs.moviestorage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Genre genre;
    private LocalDate productionDate;
    private String title;

    public Movie() {
    }

    public Movie(Genre genre, LocalDate productionDate, String title) {
        this.genre = genre;
        this.productionDate = productionDate;
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
