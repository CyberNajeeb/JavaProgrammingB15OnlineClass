package day27;

public class ArrayTask2MaxNumLookUp {

    public static void main(String[] args) {

        int[] nums = {11,99,83,44,75};

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println("max = " + max);

        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (secondMax < nums[i] && nums[i]!=max){
                secondMax = max;


            }
        }
        System.out.println("secondMax = " + secondMax);
    }
}
