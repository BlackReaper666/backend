package com.michels.backend.service;

import com.michels.backend.model.Movie;

public interface IMovieService {
    Movie findById(long id);
}
