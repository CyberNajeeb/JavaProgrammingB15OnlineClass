package day25;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 5, 21, 2};
        System.out.println("" + Arrays.toString(nums));
        int numsItemCount = nums.length;

        int[] numsCopy = new int[numsItemCount];
        for (int i = 0; i < numsCopy.length; i++) {
            numsCopy[i] = nums[i];


//        numsCopy[0] = nums[0];
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        }System.out.println(("nums copy = " + Arrays.toString(numsCopy)));

        Arrays.sort(numsCopy);
        System.out.println(("nums copy AFTER SORTING = " + Arrays.toString(numsCopy)));
    }
}