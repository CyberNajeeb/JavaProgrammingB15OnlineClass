package day05_Practice;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name!");
        String firstName = sc.next();
        System.out.println("Please enter your last name!");
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Nice to meet you, " + fullName);
        System.out.println("How old are you, " + firstName + "?");
        int age = sc.nextInt();
        System.out.println("How tall are you?");
        double height = sc.nextDouble();
        System.out.println("OMG! That is so tall!");
        System.out.println("Where did you go to school?");
        String school = sc.next();
        System.out.println("Really?? I went to the same school!");
    }
}
