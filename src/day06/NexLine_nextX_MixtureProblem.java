package day06;

import java.util.Scanner;

public class NexLine_nextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("You're so old!");
        int yearOfBirth = 2019-age;
        System.out.println("You were born in " + yearOfBirth);
        System.out.println("Address, please");
        String address = sc.nextLine();
        System.out.println("Cool neighborhood!");





    }
}
