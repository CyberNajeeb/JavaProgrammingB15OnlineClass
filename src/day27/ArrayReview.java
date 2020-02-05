package day27;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int num1 = arr[arr.length-1];

        System.out.println(num1);

        for (int x = 0; x < arr.length; x++) {
            System.out.println("Index number = " + x + ", value = " + arr[x]);

        }
        System.out.println(Arrays.toString(arr));
    }
}
