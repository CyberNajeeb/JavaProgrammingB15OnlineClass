package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Najeeb";

        char [] namesChar = new char[name.length()];
        for (int x = 0; x < namesChar.length; x++) {
            namesChar[x] = name.charAt(x);
        }
        System.out.println("namesChar = " + Arrays.toString(namesChar));
        System.out.println("===================================");
        char[] namesChar2 = name.toCharArray();
        System.out.println("namesChar2 = " + Arrays.toString(namesChar2));

        System.out.println("===================================");

        for (char name2 : namesChar){
            System.out.print(name2);
        }

        }
}
