package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.nextLine();
//
//        System.out.println("You entered " + name);
//
//        System.out.println("Enter another word.");
//
//        String anotherWord = sc.next();
        System.out.println("What is your name?");

        String name = sc.nextLine();

        System.out.println("Nice to talk to you, " + name);

        System.out.println("What city were you born in?");

        String cityOfBirth = sc.nextLine();

        System.out.println("Really, wow! " + cityOfBirth + " is soo cool!");

        System.out.println("What city are living in?");

        String cityOfResidence = sc.nextLine();

        System.out.println( cityOfResidence + " is a cool place to live in!");

    }
}
