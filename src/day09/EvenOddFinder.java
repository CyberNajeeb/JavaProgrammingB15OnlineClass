package day09;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = 311;
        System.out.println(myNumber/2);
        System.out.println(myNumber%2);
        int remainder = myNumber%2;

        if (remainder%2==0) {
            System.out.println("I have no remainder (Even number)");
        }else {
            System.out.println("Odd number");
        }


        }
    }

