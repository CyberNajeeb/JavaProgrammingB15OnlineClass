package day57;

import java.util.Arrays;

public class ExceptionExamples {
    public static void main(String[] args) {
        System.out.println("Hello, B15 Online friends");
        //int num = 2.2; compile error!

        try {
            int[] nums = new int[3];

            nums[0] = 99;
            nums[1] = 88;
            nums[2] = 77;
            nums[3] = 66;
            System.out.println("nums = " + Arrays.toString(nums));

            String str = "abc";
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ignored){
            System.out.println("Arrays and String Out Of Bounds Exceptions were caught and taken care of!");
        }
    }
}