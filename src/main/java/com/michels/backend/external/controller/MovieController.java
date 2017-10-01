package com.michels.backend.external.controller;

import com.michels.backend.external.mapper.MovieMapper;
import com.michels.backend.external.model.MovieDTO;
import com.michels.backend.model.Movie;
import com.michels.backend.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/movies")
public class MovieController {
    @Autowired
    private IMovieService movieService;
    @Autowired
    private MovieMapper movieMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<MovieDTO> getMovie(@PathVariable long id){
        Movie movie = movieService.findById(id);
        return ResponseEntity.ok(movieMapper.map(movie));
    }
}
