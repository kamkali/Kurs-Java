package com.kurs.moviestorage.controller;

import com.kurs.moviestorage.dao.GenreRepository;
import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.dto.MovieCreationDto;
import com.kurs.moviestorage.model.Genre;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    private MovieRepository movieRepository;
    private GenreRepository genreRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository, GenreRepository genreRepository) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> postMovie(@RequestBody MovieCreationDto movie) throws Exception {
        Movie movieToSave;
        Optional<Genre> genre = genreRepository.findById(movie.getGenre());

        if (genre.isPresent()){
            movieToSave = new Movie(genre.get(), LocalDate.parse(movie.getDate()), movie.getTitle());
            movieRepository.save(movieToSave);
        } else
            throw new Exception("No given genre found");


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
