package java15.database;

import java15.enums.Genre;
import models.Actor;
import models.Movie;
import models.Producer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class Database {
    public static ArrayList<Movie> movies = new ArrayList<>(Set.of(


            new Movie("1+1", LocalDate.of(2011,2,15), Genre.COMEDY,new Producer("Arno","Betoran"),
                    new LinkedList<Actor>(Set.of(
                    new Actor("François Cluzet","Philippe"),
                    new Actor("Omar Sy","Driss")))),

            new Movie("The Shawshank Redemption", LocalDate.of(1994,3,12), Genre.DRAMA,new Producer("Frenk"," Darabont"),
                    new LinkedList<Actor>(Set.of(
                    new Actor("Tim Robbins","Andy"),
                    new Actor("Morgan Freeman","Ellis")))),

            new Movie("The Green Mile", LocalDate.of(1999,2,8), Genre.DRAMA,new Producer("Frenk"," Darabont"),
                    new LinkedList<Actor>(Set.of(
                    new Actor("Tom Hanks","Paul"),
                    new Actor("David Morse","Brutal")))),

            new Movie("Fight Club", LocalDate.of(1999,2,15), Genre.ACTION,new Producer("David"," Fincher"),
                    new LinkedList<Actor>(Set.of(
                    new Actor("Edward Norton","speaker"),
                    new Actor("Brad Pitt","Tyler")))),

            new Movie("Shutter Island", LocalDate.of(2009,5,15), Genre.THRILLER,new Producer("Martin"," Scorsese"),
                    new LinkedList<Actor>(Set.of(
                    new Actor("Leonardo DiCaprio","Teddy"),
                    new Actor("Mark Ruffalo","Chuck")))),
            new Movie("Inception", LocalDate.of(2010, 7, 16), Genre.FANTASY, new Producer("Christopher", "Nolan"),
                    new LinkedList<Actor>(Set.of(
                            new Actor("Leonardo DiCaprio", "Dom Cobb"),
                            new Actor("Joseph Gordon-Levitt", "Arthur")))),

            new Movie("Pulp Fiction", LocalDate.of(1994, 10, 14), Genre.CRIMINAL, new Producer("Quentin", "Tarantino"),
                    new LinkedList<Actor>(Set.of(
                            new Actor("John Travolta", "Vincent Vega"),
                            new Actor("Uma Thurman", "Mia Wallace")))),

            new Movie("The Matrix", LocalDate.of(1999, 3, 31), Genre.FANTASY, new Producer("Lana", "Wachowski"),
                    new LinkedList<Actor>(Set.of(
                            new Actor("Keanu Reeves", "Neo"),
                            new Actor("Laurence Fishburne", "Morpheus")))),

            new Movie("Interstellar", LocalDate.of(2014, 11, 7), Genre.FANTASY, new Producer("Christopher", "Nolan"),
                    new LinkedList<Actor>(Set.of(
                            new Actor("Matthew McConaughey", "Cooper"),
                            new Actor("Anne Hathaway", "Brand")))),

            new Movie("Gladiator", LocalDate.of(2000, 5, 5), Genre.ACTION, new Producer("Ridley", "Scott"),
                    new LinkedList<Actor>(Set.of(
                            new Actor("Russell Crowe", "Maximus"),
                            new Actor("Joaquin Phoenix", "Commodus"))))
    ));


}
