package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {

        int[] myNumbers = {5,1,21,2,3};
        int size = myNumbers.length;
        int lastIndex = size-1;

        System.out.println(Arrays.toString(myNumbers));

        System.out.println(myNumbers[0] + "=====" + myNumbers[lastIndex]);
        System.out.println(myNumbers[1] + "=====" + myNumbers[lastIndex-1]);
        System.out.println(myNumbers[2] + "=====" + myNumbers[lastIndex-2]);

        for (int x = 0; x < myNumbers.length / 2; x++) {
            System.out.println(myNumbers[x] + " " + myNumbers[lastIndex-x]);

        }
        System.out.println(Arrays.toString(myNumbers));
    }

}
