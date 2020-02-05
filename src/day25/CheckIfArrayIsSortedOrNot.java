package day25;

import java.util.Arrays;

public class CheckIfArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,1,3,2};
        System.out.println("nums = " + Arrays.toString(nums));

        for (int x = 0; x < nums.length-1; x++) {
            System.out.println(nums[x] + " " + nums[x+1]);

        }
    }
}
