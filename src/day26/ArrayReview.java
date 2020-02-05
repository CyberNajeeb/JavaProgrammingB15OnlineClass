package day26;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {

        int[] myNumbers = {19,40,30,17};

        myNumbers[2] = myNumbers[0] + myNumbers[1];

        System.out.println(myNumbers[3]);

        int myTempNumber = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[myNumbers.length-1] = myTempNumber;
        System.out.println("myNumbers = " + myNumbers[0]);
        System.out.println("my Last Numbers = " + myNumbers[myNumbers.length-1]);
        System.out.println(Arrays.toString(myNumbers));
    }
}
