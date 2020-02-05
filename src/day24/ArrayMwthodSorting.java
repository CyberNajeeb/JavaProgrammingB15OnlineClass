package day24;

import java.util.Arrays;

public class ArrayMwthodSorting {

    public static void main(String[] args) {

        int[] scores = {123, 99, 299, 399, 499, 599};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        char[] nameChars = {'N', 'A', 'J', 'E', 'E', 'B',' ', 'S', 'O', 'H', 'R', 'A', 'B', 'I'};
        System.out.println("Arrays.toString nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));

    }

}
