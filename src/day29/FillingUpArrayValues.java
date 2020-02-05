package day29;

import java.util.Arrays;

public class FillingUpArrayValues {

    public static void main(String[] args) {

        int[] nunmbers = new  int[100];
        System.out.println("Before filling up the array using for loop \n"
                + Arrays.toString(nunmbers));

//        nunmbers[0] = 1;
//        nunmbers[1] = 2;
//        nunmbers[2] = 3;
        // ...

        for (int i = 0; i < nunmbers.length; i++) {
            nunmbers[i] = i+1;

        }

        System.out.println("After filling up the array using for loop \n"
                + Arrays.toString(nunmbers));
    }
}
