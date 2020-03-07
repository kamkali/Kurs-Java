package com.kurs.moviestorage.model;

import javax.persistence.*;

@Entity
public class Genre {

    @Id

    @GeneratedValue
    private Long id;
    private String type;
    private String description;
    private String characteristics;

    public Genre() {
    }

    public Genre(String type, String description, String characteristics) {
        this.type = type;
        this.description = description;
        this.characteristics = characteristics;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
