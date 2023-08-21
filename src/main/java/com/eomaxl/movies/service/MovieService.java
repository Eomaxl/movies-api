package com.eomaxl.movies.service;

import com.eomaxl.movies.dao.MovieRepository;
import com.eomaxl.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> allMovies(){
        return repository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id){
        return  repository.findById(id);
    }

    public Optional<Movie> getMovieDetailsById(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }
}
