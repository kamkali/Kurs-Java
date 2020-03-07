package com.kurs.moviestorage;

import com.kurs.moviestorage.dao.MovieRepository;
import com.kurs.moviestorage.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    private MovieRepository movieRepository;

    @Autowired
    public DataLoader(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        movieRepository.save(new Movie("LOTR"));
        movieRepository.save(new Movie("Harry Potter"));
        movieRepository.save(new Movie("Gwiezdne Wojny"));
    }
}
