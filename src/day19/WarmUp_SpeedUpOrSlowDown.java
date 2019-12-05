package day19;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting and ending speed");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("You started here: ");

        if (start < end) {

            for (int i = start; i <= end; i++) {
                System.out.print(i + ", ");
            }
        } else if (start > end) {
            System.out.println("Decrease speed");

            for (int x = start; x >= end; x--) {
                System.out.println(x + ", ");
            }
        } else

            System.out.println("No action needed.");
    }
}

