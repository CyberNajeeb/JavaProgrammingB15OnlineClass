package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Movie {

    private String name;
    private double length;
    private String type;

    public Movie() {
        System.out.println("EMPTY MOVIE");
    }

    // default constructor :
    // a constructor that give by compiler
    // only if you don't have any constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside

    // write a constructor to set all the fields value
    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    List<Movie> myFavMovieList = new ArrayList<>();
    //myFavMovieList.add(Movie);


    public void setMyFavMovieList(List<Movie> myFavMovieList) {
        this.myFavMovieList = myFavMovieList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}