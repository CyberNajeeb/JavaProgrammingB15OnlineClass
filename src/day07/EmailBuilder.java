package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = sc.nextLine();
        System.out.println("What is your last name?");
        String lastName = sc.nextLine();
        System.out.println("What is your company?");
        String company = sc.nextLine();
        System.out.println("What is your email address?");
        String email = sc.nextLine();

        System.out.println("My name is " + firstName + " "  + lastName + ". I work for " + company + ". My email address is " + email);
    }
}
