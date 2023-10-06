package com.group1.edufy_media.Services;

import com.group1.edufy_media.Model.Genre;
import com.group1.edufy_media.Repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GenreService implements GenreServiceInterface {

    @Autowired
    GenreRepository genreRepository;


    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
