package com.kurs.moviestorage.controller;

import com.kurs.moviestorage.dao.GenreRepository;
import com.kurs.moviestorage.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GenreController {

    private GenreRepository genreRepository;

    @Autowired
    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping("/genres")
    public ResponseEntity<List<Genre>> getGenres(){
        List<Genre> genres = genreRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(genres);
    }
}
