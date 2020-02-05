package officeHours;

import java.util.Arrays;
import java.util.Scanner;

public class Day34_12_27_MethodPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        age(age);

    }

    public static int age(int age) {
        if (age > 20) {
            System.out.println(age + " is eligible");

        }else
            System.out.println("Nice try, kid!");
        return age;
        }
    }
