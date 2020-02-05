package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] scores = {11,99,83,44,75};

       int minNum = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (minNum>scores[i]){
                minNum = scores[i];

            }
        }
        System.out.println(minNum);

//        int secondMin = scores[0];
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] ==minNum){
//                continue;
//            }
//            if (secondMin>scores[i]){
//                secondMin = scores[i];
        int secondMin = scores[0];
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == minNum ){
                continue;
            }
            if(secondMin >scores[i]){
                secondMin = scores[i];

            }
        }
        System.out.println("secondMin = " + secondMin);

    }
}
