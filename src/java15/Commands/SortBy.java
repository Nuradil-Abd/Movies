package java15.Commands;

import java15.dao.MovieSortableServiceDao;
import java15.dao.impl.MovieSortableServiceDaoImpl;
import java15.database.Database;

import java.util.Scanner;

public class SortBy {
    public void sortBy(Scanner scan){
        MovieSortableServiceDao movieSSDao = new MovieSortableServiceDaoImpl();


        try{
            while(true){
                Show.show3();
                System.out.print("\nWrite command: ");
                String choice = scan.nextLine().trim();
                switch (choice){
                    case "1" -> {
                        System.out.print("Write asc or desc: ");
                        String command = scan.nextLine().toLowerCase().trim();
                        movieSSDao.sortMovieByName(command);
                        System.out.println("Movies sorted successfully.");
                        System.out.println(Database.movies);
                    }
                    case "2" -> {
                        System.out.print("Write asc or desc: ");
                        String command = scan.nextLine().toUpperCase().trim();
                        try {
                            movieSSDao.sortByYear(command);
                            System.out.println("Movies sorted successfully.");
                            System.out.println(Database.movies);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    case "3" -> {
                        System.out.print("Write name or lastName: ");
                        String command = scan.nextLine().toUpperCase().trim();
                        try{
                            movieSSDao.sortByProducer(command);
                            System.out.println("Movies sorted successfully.");
                            System.out.println(Database.movies);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    case "0" -> {
                        SelectCommand.start(scan);
                        return;
                    }
                    default -> System.out.println("Invalid command. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }

}
