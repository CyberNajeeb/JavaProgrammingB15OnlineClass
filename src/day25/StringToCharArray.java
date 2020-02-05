package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String name = "Najeeb";

        char[] allCharsInName = name.toCharArray();
        for (char eachChar : allCharsInName){
            System.out.println("eachChar = " + eachChar);
        }

        int count = 0;
        for (char eachChar : allCharsInName){

            if (eachChar=='e'){
                ++count;
            }
        }
        System.out.println("count of all Es in the name = " + count);

        }
}
