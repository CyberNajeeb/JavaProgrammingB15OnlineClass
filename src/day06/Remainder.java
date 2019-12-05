package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
//        System.out.println(5/2);
//        System.out.println(5.0/2);
//        System.out.println(5.0/2f);
//        System.out.println(5%2);
//
        System.out.println("Please enter the hour, minute, and second:");
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
