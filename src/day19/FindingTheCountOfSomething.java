package day19;

import java.util.Arrays;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {


                System.out.println(i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        String name = "Najeeb";
        for (int x = 0; x<=name.length(); x++){
            System.out.println(name.charAt(x));
        }
    }
}