package com.michels.backend.repository;

import com.michels.backend.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository <Movie, Long> {

}
