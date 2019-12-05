package day06;

import java.util.Scanner;

public class CoinConverter {

    public static void main(String[] args) {

        int penny = 100;
        int dime = penny / 10;
        int quarter = penny / 4;
        int dollar = penny / 100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of dimes you have:");

        dime = sc.nextInt();
        System.out.println("You have " + penny + " dollars.");

    }
}
