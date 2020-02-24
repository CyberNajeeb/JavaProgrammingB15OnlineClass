package day42;
import day43.MovieUtility;
import java.util.Scanner;
import day42.Movie;

public class MovieAction {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");
        String password = sc.next();
        if (password.equals("123456789")) {
            Movie m1 = new Movie();
        } else {
            System.out.println("invalid password");
        }
        Movie m1 = new Movie();
        printMovieInformation(m1);
        System.out.println("Movie 1 = " + m1);

        //return "failed";

//        Movie m1 = new Movie();
//        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", 2.2, "Drama");
        Movie m3 = new Movie("Frozen2", 1.5, "Family");
        Movie m4 = new Movie("Pursuit of Happiness", 2.0, "Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        // I WANT TO GET THE name OF M2 SEPARATELY SO I CAN DO SOME STUFF
        // I can not access the field directly because it's private
        // i need a getter method to access
        // System.out.println(m2.name);
        // System.out.println(m2.getName());


    }

    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        System.out.println("The movie Name is " + movieObj.getName());



    }


}