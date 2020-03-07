package com.kurs.moviestorage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping("/movies")
    public List<String> getMovies() {
        return Arrays.asList("Rambo", "Rocky", "Terminator");
    }
}
