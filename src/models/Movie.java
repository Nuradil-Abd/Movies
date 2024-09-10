package models;

import java15.enums.Genre;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String name;
    private LocalDate year;
    private Genre genre;
    private Producer producer;
    private List<Actor> actor;

    public Movie() {
    }

    public Movie(String name, LocalDate year, Genre genre, Producer producer, List<Actor> actor) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~~Movie~~~~~~~~~~" +
                "\nname: '" + name + '\'' +
                " ~~~ year: " + year +
                " ~~~ genre: " + genre +
                "\n"+ producer +
                 actor;
    }
}
