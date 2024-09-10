package service;

import java15.enums.Genre;
import models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    List<Movie> findMovieByFullNameOrPartName(String name);
    List<Movie> findMovieByActorName(String actorName);
    List<Movie> findMovieByYear(int year);
    List<Movie> findMovieByProducer(String producerFullName);
    List<Movie> findByGenre(Genre genre);
    String findRoleByActorAndMoveName(String actorFullName, String movieName);
}
