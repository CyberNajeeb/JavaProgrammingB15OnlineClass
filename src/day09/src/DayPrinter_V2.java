package day09.src;

import java.util.Scanner;

public class DayPrinter_V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for today:");
        int dayCode = sc.nextInt();
        String dayName = "";
        if (dayCode==1) {
            dayName = "Monday!";
        }else if (dayCode==2) {
            dayName = "Tuesday!";
        }else if (dayCode==3) {
            dayName = "Wednesday!";
        }else if (dayCode==4) {
            dayName = "Thursday!";
        }else if (dayCode==5) {
            dayName = "Friday!";
        }else if (dayCode==6) {
            dayName = "Saturday!";
        }else if (dayCode==7) {
            dayName = "Sunday!";
        }else {
            dayName = "Unknown";


        }            System.out.println("Today is " + dayName);

    }
}
