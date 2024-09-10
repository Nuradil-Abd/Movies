package java15.Commands;

import java15.enums.Genre;
import service.MovieService;
import service.impl.MovieServiceImpl;

import java.util.Scanner;

public class Find {

    public void find(Scanner scan){
        MovieService movieService = new MovieServiceImpl();

        try {
            while (true){
                Show.show2();
                System.out.print("\nWrite command: ");
                String choice = scan.nextLine().trim();
                switch (choice){
                    case "1" -> {
                        System.out.println("~~~~~~~~~~~All movies~~~~~~~~~~~ ");
                        System.out.println(movieService.getAllMovies());
                    }
                    case "2" -> {
                        System.out.print("Write movie: ");
                        String targetMovie = scan.nextLine().toUpperCase().trim();
                        System.out.println(movieService.findMovieByFullNameOrPartName(targetMovie));

                    }
                    case "3" -> {
                        System.out.print("Write actor name: ");
                        String targetMovie = scan.nextLine().toUpperCase().trim();
                        System.out.println(movieService.findMovieByActorName(targetMovie));

                    }
                    case "4" -> {
                        System.out.print("Write year: ");
                        try{
                            int targetMovie = scan.nextInt();
                            System.out.println(movieService.findMovieByYear(targetMovie));
                            scan.nextLine();
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid year format. Please enter a valid integer.");
                        }

                    }
                    case "5" -> {
                        System.out.print("Write producer: ");
                        String targetMovie = scan.nextLine().toUpperCase().trim();
                        System.out.println(movieService.findMovieByProducer(targetMovie));

                    }
                    case "6" -> {
                        System.out.print("Write genre: ");
                        String targetMovie = scan.nextLine().toUpperCase().trim().replace(" ", "");
                        System.out.println(movieService.findByGenre(Genre.valueOf(targetMovie)));


                    }
                    case "7" ->{
                        System.out.print("Write Actor name: ");
                        String targetActor = scan.nextLine().toUpperCase().trim();
                        System.out.print("Write movie: ");
                        String targetMovie = scan.nextLine().toUpperCase().trim();
                        System.out.println(targetActor +" - " + movieService.findRoleByActorAndMoveName(targetActor, targetMovie));

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
