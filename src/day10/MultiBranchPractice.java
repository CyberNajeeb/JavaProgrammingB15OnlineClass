package day10;

import java.util.Scanner;

public class MultiBranchPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to McDonald's! Whatt can I get you today!");

        String burger  = sc.nextLine();
        String frenchFries  = sc.nextLine();
        String nuggets = sc.nextLine();
        String iceCream = sc.nextLine();
        String coke = sc.nextLine();
        int menuOptions = sc.nextInt();
        String order = "";
        if (menuOptions==1) {
            System.out.println("You have selected " + menuOptions);
            order = burger;
        }else if (menuOptions==2){
            order = frenchFries;
            System.out.println("You have selected " + menuOptions);
        }else if (menuOptions==3){
            order = iceCream;
            System.out.println("You have selected " + menuOptions);
        }else if (menuOptions==4){
            order = nuggets;
            System.out.println("You have selected " + menuOptions);
        }else if (menuOptions==5){
            order = coke;
            System.out.println("You have selected " + menuOptions);
        }
    }
}
