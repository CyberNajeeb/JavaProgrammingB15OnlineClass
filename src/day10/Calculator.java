package day10;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator = 'A';
        switch (operator) {
            case '+':
                System.out.println("Adding #s");
                break;
            case '-':
                System.out.println("Subtracting #s");
                break;
            case '*':
                System.out.println("Multiplying #s");
                break;
            case '/':
                System.out.println("Dividing #s");
                break;
            default:
                System.out.println("Do something!");

        }
    }
}
