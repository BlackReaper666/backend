package com.michels.backend;

import com.michels.backend.model.Movie;
import com.michels.backend.repository.MovieRepository;
import com.michels.backend.service.IMovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@EnableJpaRepositories(basePackages = ("com.michels.backend.repository"))
@EntityScan(basePackages = "com.michels.backend.model")
@ActiveProfiles("test")
@TestPropertySource(locations="classpath:application-test.properties")
public class IntegrationTest {
    @Autowired
    public IMovieService movieService;
    @Autowired
    public MovieRepository movieRepository;

    @Test
    public void test(){
        Movie movie = new Movie();
        movie.setName("test");
        movie.setProducer("test2");
        movieRepository.save(movie);
        Movie result = movieService.findById(movie.getId());
    }
}
