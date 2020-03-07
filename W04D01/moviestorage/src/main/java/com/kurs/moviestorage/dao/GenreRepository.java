package com.kurs.moviestorage.dao;

import com.kurs.moviestorage.model.Genre;
import com.kurs.moviestorage.model.GenreType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
    List<Genre> findAll();
}
