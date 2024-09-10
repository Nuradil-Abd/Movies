package java15.dao;

public interface MovieSortableServiceDao {
    void sortMovieByName(String ascOrDesc);
    void sortByYear(String ascOrDesc);
    void sortByProducer(String nameOrLastName);
}
