package java15.dao.impl;

import java15.dao.MovieSortableServiceDao;
import java15.database.Database;
import models.Movie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieSortableServiceDaoImpl implements MovieSortableServiceDao {
    @Override
    public void sortMovieByName(String ascOrDesc) {
        List<Movie> movies = Database.movies;
        if (ascOrDesc == null || (!ascOrDesc.equalsIgnoreCase("asc") && !ascOrDesc.equalsIgnoreCase("desc"))) {
            throw new IllegalArgumentException("Invalid sort direction. Use 'asc' for ascending or 'desc' for descending.");
        }
        Comparator<Movie> comparator = Comparator.comparing(Movie::getName);

        if (ascOrDesc.equalsIgnoreCase("desc")) {
            comparator = comparator.reversed();
        }

        Collections.sort(movies, comparator);

    }

    @Override
    public void sortByYear(String ascOrDesc) {
        List<Movie> movies = Database.movies;
        if (ascOrDesc == null || (!ascOrDesc.equalsIgnoreCase("asc") && !ascOrDesc.equalsIgnoreCase("desc"))){
            throw new IllegalArgumentException("Invalid sort direction. use 'asc' for ascending or 'desc' for descending.");
        }
        Comparator<Movie> comparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Integer.compare(m1.getYear().getYear(), m2.getYear().getYear());
            }
        };

        if (ascOrDesc.equalsIgnoreCase("desc")) {
            comparator = comparator.reversed();
        }

        Collections.sort(movies, comparator);

    }

    @Override
    public void sortByProducer(String nameOrLastName) {
        List<Movie> movies = Database.movies;

        if (nameOrLastName == null || (!nameOrLastName.equalsIgnoreCase("name") && !nameOrLastName.equalsIgnoreCase("lastName"))) {
            throw new IllegalArgumentException("Invalid! Use 'name' to sort by producer's first name or 'lastName' to sort by producer's last name.");
        }

        Comparator<Movie> comparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                if (nameOrLastName.equalsIgnoreCase("name")) {
                    return m1.getProducer().getFirstName().compareTo(m2.getProducer().getFirstName());
                } else {
                    return m1.getProducer().getLastName().compareTo(m2.getProducer().getLastName());
                }
            }
        };

        Collections.sort(movies, comparator);
    }
}
