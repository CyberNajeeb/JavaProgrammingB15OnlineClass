package day29;

import java.util.Arrays;

public class ILoveJavaStringFillingInArray {
    public static void main(String[] args) {

        String[] love = new String [10];

        for (int i = 0; i < love.length; i++) {

            love[i] = (i+1) + ". I Love Java";

        }System.out.println(Arrays.toString(love));
    }

}
