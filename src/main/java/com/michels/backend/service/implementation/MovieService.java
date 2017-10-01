package com.michels.backend.service.implementation;

import com.michels.backend.model.Movie;
import com.michels.backend.repository.MovieRepository;
import com.michels.backend.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie findById(long id){
        return movieRepository.findOne(id);
    }
}
