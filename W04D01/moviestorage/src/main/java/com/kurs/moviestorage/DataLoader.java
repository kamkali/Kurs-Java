package com.kurs.moviestorage;

import com.kurs.moviestorage.dao.GenreRepository;
import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.model.Genre;
import com.kurs.moviestorage.model.GenreType;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;


@Component
public class DataLoader implements ApplicationRunner {

    private MovieRepository movieRepository;
    private GenreRepository genreRepository;

    @Autowired
    public DataLoader(MovieRepository movieRepository, GenreRepository genreRepository) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Genre adventureGenre = new Genre("Adventure", "Description1", "Characteristics1");
        Genre fantasyGenre = new Genre("Fantasy", "Desc2", "Char2");
        Genre actionGenre = new Genre("Action", "Desc3", "Char3");
        genreRepository.saveAll(Arrays.asList(actionGenre, adventureGenre, fantasyGenre));

        LocalDate LOTRDate = LocalDate.of(2000, 5, 30);
        LocalDate HPDate = LocalDate.of(2005, 3, 12);

        movieRepository.saveAll(Arrays.asList(
                new Movie(adventureGenre, LOTRDate, "LOTR"),
                new Movie(fantasyGenre, HPDate, "Harry Potter"),
                new Movie(actionGenre, LocalDate.of(2003, 12, 15), "Matrix")
        ));
    }
}
