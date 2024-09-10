package service.impl;

import java15.dao.MovieSortableServiceDao;
import java15.dao.impl.MovieSortableServiceDaoImpl;
import service.MovieSortableService;

public class MovieSortableServiceImpl implements MovieSortableService {
    MovieSortableServiceDao movieSSDao = new MovieSortableServiceDaoImpl();
    @Override
    public void sortMovieByName(String ascOrDesc) {
        movieSSDao.sortMovieByName(ascOrDesc);
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        movieSSDao.sortMovieByName(ascOrDesc);
    }

    @Override
    public void sortByProducer(String nameOrLastName) {
        movieSSDao.sortMovieByName(nameOrLastName);

    }
}
