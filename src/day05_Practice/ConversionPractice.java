package day05_Practice;

import java.util.Scanner;

public class ConversionPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of days.");
//        int numberOfDays = sc.nextInt();
//        int oneDay = numberOfDays*24;
//        System.out.println("There are " + oneDay + " hours in " + " in " + numberOfDays + " days");

        System.out.println("What is your hourly wage rate?");
        double wageRate = sc.nextDouble();
        System.out.println("How many hours do you work daily?");
        double hoursWorked = sc.nextDouble();
        double dailyWage = wageRate * hoursWorked;
        System.out.println("Your daily wage is " + dailyWage + " for today!");


    }
}
