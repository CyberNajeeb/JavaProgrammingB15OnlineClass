package day17;

import java.util.Scanner;

public class MyName_BackwardPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String name = sc.nextLine();
        int x = name.length()-1;

        while (x>=0){
            System.out.print("Index " + x + " : ");

            System.out.println(name.charAt(x));
            --x;
        }
    }
}
