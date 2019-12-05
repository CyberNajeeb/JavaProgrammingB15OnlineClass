package day12;

import java.util.Scanner;

public class CarShopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String carMake = sc.next();
        int carPrice = sc.nextInt();

        double carBudget = 80;

        if (carMake.equalsIgnoreCase("Tesla") || carMake.equalsIgnoreCase("Corolla") && carPrice <= carBudget) {
            System.out.println("You got yourself a new car");
        }else {
            System.out.println("Maybe later");
        }
    }
}
