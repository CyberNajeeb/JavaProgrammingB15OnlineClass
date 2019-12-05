package day14;

import java.util.Scanner;

public class OfficeHour2 {

    public static void main(String[] args) {

        String season = "fall";

//        if (season.equalsIgnoreCase("spring") || (season.equalsIgnoreCase("summer")
//                || (season.equalsIgnoreCase("fall")))){
//            System.out.println("Ducks are active");

            switch (season){
                case "spring": case "summer": case "fall":
                        System.out.println("Ducks are active");
            }
        }
//        Scanner sc = new Scanner(System.in);
//        String season = sc.nextLine();
//        if (season.equalsIgnoreCase("spring")) {
//            System.out.println("Ducks are active");
//            if (season.equalsIgnoreCase("summer")) {
//                System.out.println("Ducks are active");
//                if (season.equalsIgnoreCase("fall")) {
//                    System.out.println("Ducks are active");
//                }
//            }
//        }
    }

