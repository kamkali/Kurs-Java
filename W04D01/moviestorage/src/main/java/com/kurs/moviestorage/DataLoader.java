package com.kurs.moviestorage;

import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements ApplicationRunner {

    private MovieRepository movieRepository;

    @Autowired
    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LocalDate LOTRDate = LocalDate.of(2000, 5, 30);
        LocalDate HPDate = LocalDate.of(2005, 3, 12);

        movieRepository.save(new Movie("Adventure", LOTRDate, "LOTR"));
        movieRepository.save(new Movie("Fantasy", HPDate, "Harry Potter"));
        movieRepository.save(new Movie("Action", LocalDate.of(2003, 12, 15), "Matrix"));
    }
}
