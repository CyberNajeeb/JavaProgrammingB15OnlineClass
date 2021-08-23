package AdHocPractice;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        for (int eachArr : numbers) {
            if (eachArr % 2 != 0) {
                continue;
            }
            //System.out.println();
            System.out.print(eachArr + ", ");

        }
    }
}
