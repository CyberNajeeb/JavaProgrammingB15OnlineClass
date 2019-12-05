package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your current speed?");

        int currentSpeed = sc.nextInt();

        System.out.println("What is the limit?");

        int speedLimit = sc.nextInt();

        if (currentSpeed > speedLimit) {
            System.out.println("Damn!");
        } else {
            System.out.println("Have a great day!");
        }

    }
}
