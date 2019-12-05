package day17;

import java.util.Scanner;

public class WakeupTest_NameCorrector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name in different letter cases.");
        String name = "naJeEb";
//       String nameFixed = (name.charAt(0) + "").toUpperCase();
//       nameFixed = nameFixed + name.substring(1).toLowerCase();
//        System.out.println("nameFixed = " + nameFixed);

        String nameFixed = name.toUpperCase().substring(0,1);
            nameFixed += name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);

    }
}
