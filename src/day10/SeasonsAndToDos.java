package day10;

import java.util.Scanner;

public class SeasonsAndToDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a season name for activity recommendations:");
        String activity = sc.next();
        switch (activity) {
            case "Fall":
                activity = "Walk in the park";
                break;
            case "Spring":
                activity = "Sight-see";
                break;
            case "Summer":
                activity = "Go party";
                break;
            case "Winter":
                activity = "Very cold";
                break;
            default:
                System.out.println("No activity found!");


        }
        System.out.println(activity);
    }
}
