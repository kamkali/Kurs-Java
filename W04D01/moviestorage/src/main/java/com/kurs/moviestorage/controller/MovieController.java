package com.kurs.moviestorage.controller;

import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.dto.MovieCreationDto;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public ResponseEntity<Movie> postMovie(@RequestBody MovieCreationDto movie){

        Movie movieToSave = new Movie(movie.getGenere(), LocalDate.parse(movie.getDate()), movie.getTitle());
        movieRepository.save(movieToSave);

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
