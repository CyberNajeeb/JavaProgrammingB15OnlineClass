package day09;

import java.util.Scanner;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String CitizenType;

        int age = 44;
        if (age > 45) {
         CitizenType = "Senior";
        } else {
            CitizenType = "Not senior";
        }
        System.out.println("The citizen age is " + age + " and the citizen is " + CitizenType);

        }
    }

