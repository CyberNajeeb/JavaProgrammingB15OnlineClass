package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        int age = 17;
        if (age >= 18) {
            System.out.println("You may vote.");
        } else {
            System.out.println("Come back when you are 18 years of age!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("What is my favorite number?");
        int myFavoriteNumber = sc.nextInt();

        if (myFavoriteNumber >= 17) {
            System.out.println("BINGO!");
        } else {
            System.out.println("Try again!");

    }
    }
}
