package day10;

import java.util.Scanner;

public class MultiBranchPractice_WithSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to McDonald's! What can I get you today!");
        String burger, frenchFries, nuggets, iceCream, coke;
        int menuOptions = sc.nextInt();
        String order = "";

        switch (menuOptions) {
            case 1:
                order = "Burger";
                System.out.println(" You ordered " + order);
                break;
            case 2:
                order = "Nuggets";
                System.out.println(" You ordered " + order);
                break;
            case 3:
                order = "Ice Cream";
                System.out.println(" You ordered " + order);
                break;
            case 4:
                order = "French Fries";
                System.out.println(" You ordered " + order);
                break;
            case 5:
                order = "Coke";
                System.out.println(" You ordered " + order);
                break;
            default:
                System.out.println(" You ordered an unrecognizable order number");

        }

    }
}

