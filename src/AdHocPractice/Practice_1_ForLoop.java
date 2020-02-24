package AdHocPractice;

import java.util.Scanner;

public class Practice_1_ForLoop {

    public static void main(String[] args) {

        //  1.  Write a program that can print out the unique values from an int Array
        //   Ex:
//        if arr -> {1,1,2,3,3}
//        output: 2

//        int[] array1 = {1,2,3,1,3,4,4};
//
//        for (int i = 0; i < array1.length; i++) {
//
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        if (fullName.equalsIgnoreCase("Max Payne")) {
            System.out.println("User found!");
        } else if (fullName.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");

        } else {
            System.out.println("User not found!");
        }
    }

}