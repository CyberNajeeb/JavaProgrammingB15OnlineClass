package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {

        System.out.println(getListFrom1TillFinalNumber(7));
        System.out.println(getListFrom1TillFinalNumber(2));
        System.out.println(getListFrom1TillFinalNumber(20));

        List<Integer> myList = getListFrom1TillFinalNumber(25);
        System.out.println("myList = " + myList);
    }

    public static List<Integer> getListFrom1TillFinalNumber(Integer finalNumber) {
        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
        return nums;
    }
}