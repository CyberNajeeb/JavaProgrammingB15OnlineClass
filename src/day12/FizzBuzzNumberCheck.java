package day12;

import java.util.Scanner;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 5 == 0&&num % 3 == 0) {
            System.out.println("Fizz number");
        } else if (num % 3 != 0) {
            System.out.println("Not a Fizz number");
        } else {
            System.out.println(" Find the Fizz number");
        }
    }
}
