package day17;

import java.util.Scanner;

public class WakeuUp_FullNameCorrector_WithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //                 01234567890123
        String fullName = "naJeEb SOhrAbI";

        int indexOfSpace = fullName.indexOf(" ");
        //String firstName = fullName.substring(0,6 indexOfSpace);
        //OR
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        String nameCorrected =
                firstName.toUpperCase().substring(0,1)
                + firstName.toLowerCase().substring(1);
        System.out.println("nameCorrected = " + nameCorrected);
    }
}
