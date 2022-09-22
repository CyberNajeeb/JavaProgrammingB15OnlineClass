package day01;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Say something");
        Scanner scanner = new Scanner(System.in);
        String milkType = scanner.nextLine();
        if (milkType.contains("whole milk")) {
            System.out.println("Buy two quarts");
        } else if (milkType.contains("low fat milk")) {
            System.out.println("Buy only one quart");
        } else {
            System.out.println("Buy almond milk");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("around the world in " + i + " minutes");
        }

    }
}
