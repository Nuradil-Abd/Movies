package java15.dao.impl;

import java15.dao.MovieDao;
import java15.database.Database;
import java15.enums.Genre;
import models.Actor;
import models.Movie;

import java.util.LinkedList;
import java.util.List;

public class MovieDaoImpl implements MovieDao {
    @Override
    public List<Movie> getAllMovies() {
        return Database.movies;
    }

    @Override
    public List<Movie> findMovieByFullNameOrPartName(String name) {
        List<Movie> targetMovies = new LinkedList<>();
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Movie name cannot be null or empty");
        }
        for (Movie movie : Database.movies) {
            if(movie.getName().toUpperCase().contains(name)){
                targetMovies.add(movie);
            }

        }
        return targetMovies;
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        List<Movie> targetMovies = new LinkedList<>();
        if (actorName == null || actorName.isEmpty()) {
            throw new IllegalArgumentException("Actor name cannot be null or empty");
        }
        for (Movie movie : Database.movies) {
            for (Actor actor : movie.getActor()) {
                if(actor.getFullName().toUpperCase().contains(actorName)){
                    targetMovies.add(movie);
                }
            }
        }
        return targetMovies;
    }

    @Override
    public List<Movie> findMovieByYear(int year) {
        List<Movie> targetMovies = new LinkedList<>();
        for (Movie movie : Database.movies) {
            if(movie.getYear().getYear() == year ){
                targetMovies.add(movie);
            }
        }
        return targetMovies;
    }

    @Override
    public List<Movie> findMovieByProducer(String producerFullName) {
        List<Movie> targetMovies = new LinkedList<>();
        if (producerFullName == null || producerFullName.isEmpty()) {
            throw new IllegalArgumentException("Producer name cannot be null or empty");
        }
        for (Movie movie : Database.movies) {
            if(producerFullName.contains(movie.getProducer().getFirstName().toUpperCase()) || producerFullName.contains(movie.getProducer().getLastName().toUpperCase())){
                targetMovies.add(movie);
            }
        }
        return targetMovies;
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        List<Movie> targetMovies = new LinkedList<>();
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null");
        }
        for (Movie movie : Database.movies) {
            if(movie.getGenre().equals(genre)){
                targetMovies.add(movie);
            }

        }

        return targetMovies;
    }

    @Override
    public String findRoleByActorAndMoveName(String actorFullName, String movieName) {
        List<Movie> targetMovies = new LinkedList<>();
        if (actorFullName == null || actorFullName.isEmpty() || movieName == null || movieName.isEmpty()) {
            throw new IllegalArgumentException("Actor name and movie name cannot be null or empty");
        }
        for (Movie movie : findMovieByFullNameOrPartName(movieName)) {
            for (Actor actor : movie.getActor()) {
                if(actor.getFullName().toUpperCase().contains(actorFullName)){
                    return actor.getRole();
                }
            }
        }
        return "not found";
    }


}
