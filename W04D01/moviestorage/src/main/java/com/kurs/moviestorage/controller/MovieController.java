package com.kurs.moviestorage.controller;

import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
public class MovieController {

    private MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> postMovie(@RequestBody String title){
        Movie movieToSave = new Movie(title);

        Movie savedMovie = movieRepository.save(movieToSave);
        movieToSave.setId(savedMovie.getId());

        return ResponseEntity.status(HttpStatus.OK).body(movieToSave);
    }

    @GetMapping("/movies")
    public List<Movie> getMovies(@RequestParam(value = "title", required = false) Optional<String> title) {
        if (title.isPresent())
            return movieRepository.findMovieByTitle(title.get());
        else
            return movieRepository.findAll();
    }
}
