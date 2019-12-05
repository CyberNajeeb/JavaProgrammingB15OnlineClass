package day18;

import java.util.Scanner;

public class SmartLockDoorOpener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username");
        String userName = sc.next();
        System.out.println("Please enter your password");
        //"";
        String password = sc.next(); //"";

        while (!userName.equals("Najeeb") || !password.equals( "ShamaliJan0093")){
            System.out.println("Wrong username or password!");
            System.out.println("Please enter your correct username");
            userName = sc.next();
            System.out.println("Please enter your correct password");
            password = sc.next();
        }
        System.out.println("Welcome home!");


    }
}
