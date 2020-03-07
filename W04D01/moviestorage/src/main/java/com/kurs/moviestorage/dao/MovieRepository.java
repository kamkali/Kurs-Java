package com.kurs.moviestorage.dao;

import com.kurs.moviestorage.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findAll();
    List<Movie> findMovieByTitle(String title);
}
