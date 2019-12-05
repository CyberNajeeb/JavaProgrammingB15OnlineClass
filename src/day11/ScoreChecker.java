package day11;

import java.util.Scanner;

public class ScoreChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score:");
        int score = sc.nextInt();

        if (score >= 100) {
            System.out.println("Great job!");
        } else if (score < 100 && score >= 90) {
            System.out.println("Keep up the good work");
        } else if (score <= 90 && score >= 80) {
            System.out.println("You did ok!");
        } else if (score < 70) {
            System.out.println("Shame on you!");

        } else {
            System.out.println("Show me some score");
        }
    }
}