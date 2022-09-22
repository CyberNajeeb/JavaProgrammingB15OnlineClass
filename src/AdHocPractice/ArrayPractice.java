package AdHocPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class ArrayPractice {
    public static void main(String[] args) {

        uniqueChars("teeter");
        int[] arr = {2, -1, 3, 5};


        Arrays.sort(arr);
        int minArr = arr[0];
        //System.out.println(minArr);
        int[] arr3 = Arrays.copyOf(arr, 22);

        // System.out.println(Arrays.toString(arr3));

        String[] strings = {"", ""};
    }

    public static void uniqueChars(String str) {

        Map<Character, Integer> charList = new HashMap<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    if (count == 1)
                        charList.put(str.charAt(i), count);
                }
            }

        }
        System.out.println(charList);
    }
}
