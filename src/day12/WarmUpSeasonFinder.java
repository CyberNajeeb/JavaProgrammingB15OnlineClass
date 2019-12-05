package day12;

import java.util.Scanner;

public class WarmUpSeasonFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the favorite number of the month");
        int month = sc.nextInt();

        if (month>12) {
            System.out.println("Ivalid month");
        }else if (month>=4&&month<=6) {
            System.out.println("Summer days!");
        }else if (month>=1&&month<=3) {
            System.out.println("I love spring");
        }else if (month>=7&&month<=9) {
            System.out.println("Free Falling");
        }else if (month>=10&&month<=12) {
            System.out.println("I'm cold");
        }else {
            System.out.println("There are only 1 - 12 months in a year!");
        }
    }
}
