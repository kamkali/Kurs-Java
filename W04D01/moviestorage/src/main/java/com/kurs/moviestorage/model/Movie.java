package com.kurs.moviestorage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String genere;
    private LocalDate productionDate;
    private String title;

    public Movie() {
    }

    public Movie(String genere, LocalDate productionDate, String title) {
        this.genere = genere;
        this.productionDate = productionDate;
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
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
