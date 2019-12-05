package day18;

import java.util.Scanner;

public class GiveMe_$5_Or_$20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want?");
        int x = sc.nextInt();

        while (!(x==5 || x==20)){
            System.out.println("Not what I asked for!");
            System.out.println("Give me $5 or $20!");
            x = sc.nextInt();

        }
            System.out.println("Thanks!");
    }

}
