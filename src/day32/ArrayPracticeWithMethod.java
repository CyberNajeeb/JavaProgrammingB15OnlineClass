package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        int[] scores = {2,5,8,23,4,5,6};
       // printArrayItems(new int [] {2,5,8,23,4,5,6});
        printArrayItems(scores);
        maxNumberprint(scores);
        printSumOfIntArray(scores);

        compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1, names2);
    }
    public static void printArrayItems(int[] nums){

        System.out.println("array items include " + Arrays.toString(nums));
    }
    public static void maxNumberprint(int[] num){
        int max = 0;
        for (int i = 0; i < num.length; i++) {

         if (max<num[i]){
             max=num[i];
         }
        }
        System.out.println("max = " + max);
    }
    public static void printSumOfIntArray(int[] nums){
        int sum = 0;
        for (int each : nums){
            sum=sum+each;
        }
        System.out.println("sum = " + sum);
    }
    public static void compare2arraySize(String[]arr1, String[] arr2){
        if (arr1.length > arr2.length){
            System.out.println("Array one has more items");

        }else if (arr1.length < arr2.length){
            System.out.println("Array one has less items");
        }else {
            System.out.println("They have the same number of items");
        }
    }
}
