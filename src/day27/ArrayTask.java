package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userNumbers = new int[5];
        for (int i = 0; i < 5; i++) {


            System.out.println("Please enter a number");

            int input = sc.nextInt();
            userNumbers[i] = input;

        }

        System.out.println(Arrays.toString(userNumbers));


    }
}
