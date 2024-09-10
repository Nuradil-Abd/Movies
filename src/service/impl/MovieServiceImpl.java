package service.impl;

import java15.dao.MovieDao;
import java15.dao.impl.MovieDaoImpl;
import java15.enums.Genre;
import models.Movie;
import service.MovieService;

import java.util.List;

public class MovieServiceImpl implements MovieService {
    MovieDao movieDao = new MovieDaoImpl();
    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public List<Movie> findMovieByFullNameOrPartName(String name) {
        return movieDao.findMovieByFullNameOrPartName(name);
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        return movieDao.findMovieByActorName(actorName);
    }

    @Override
    public List<Movie> findMovieByYear(int year) {
        return movieDao.findMovieByYear(year);
    }

    @Override
    public List<Movie> findMovieByProducer(String producerFullName) {
        return movieDao.findMovieByProducer(producerFullName);
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        return movieDao.findByGenre(genre);
    }

    @Override
    public String findRoleByActorAndMoveName(String actorFullName, String movieName) {
        return movieDao.findRoleByActorAndMoveName(actorFullName,movieName);
    }

}
