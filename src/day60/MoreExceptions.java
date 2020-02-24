package day60;

import java.util.Scanner;

public class MoreExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Input 1");

            int x = sc.nextInt();
            System.out.println("Input 2");
            int y = sc.nextInt();
            //int result = x/y;
            if (y == 0) {
                throw new ArithmeticException("Invalid Input!");
            } else {
                System.out.println(x / y);
            }
        } catch (ArithmeticException ignored) {
        }
    }
}
