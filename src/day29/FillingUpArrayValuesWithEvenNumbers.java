package day29;

import java.util.Arrays;

public class FillingUpArrayValuesWithEvenNumbers {

    public static void main(String[] args) {

        int[] nunmbers = new  int[100];
        System.out.println("Before filling up the array using for loop \n"
                + Arrays.toString(nunmbers));

        nunmbers[0] = 2;
        nunmbers[1] = 4;
        for (int i = 0; i < nunmbers.length; i++) {
            nunmbers[i] = i*2;

        }
        System.out.println("nunmbers = " + Arrays.toString(nunmbers));
    }
}
