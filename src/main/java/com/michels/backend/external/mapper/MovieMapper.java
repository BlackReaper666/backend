package com.michels.backend.external.mapper;

import com.michels.backend.external.model.MovieDTO;
import com.michels.backend.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieDTO map(Movie movie){
        if(movie == null){
            return null;
        }
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(movie.getId());
        movieDTO.setName(movie.getName());
        movieDTO.setProducer(movie.getProducer());
        return movieDTO;
    }

}
