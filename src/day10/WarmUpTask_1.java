package day10;

import java.util.Scanner;

public class WarmUpTask_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myAnswer = "";
        int myNumber = sc.nextInt();
        if (myNumber%5==0) {
            myAnswer = "Fizz Number";
            System.out.printf("Fizz Number");
        }else {
            myAnswer = "Not a Fizz Number";
            System.out.println("Print my number. It is " + myNumber + " and it is " + myAnswer);
        }

    }
}
