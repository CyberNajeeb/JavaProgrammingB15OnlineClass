package day14;

import java.util.Scanner;

public class OfficeHour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like?");
        String mainOption = sc.next();

        if (mainOption.equalsIgnoreCase("food")) {
            System.out.println("You have selected food");
            System.out.println("Would you like meal or snack?");
            String secondaryOption = sc.next();
            sc.nextLine();
            if (secondaryOption.equalsIgnoreCase("Snack")) {
                System.out.println("You have selected snack");
                if (secondaryOption.equalsIgnoreCase("meal")) {
                    System.out.println("You have selected meal");
                } else {
                    System.out.println("No such option");
                }
            }
        }
    }
}
