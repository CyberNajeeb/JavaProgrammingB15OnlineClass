package officeHours;

import java.util.Arrays;

public class Day23_12_09_ArrayPractice {

    public static void main(String[] args) {

     int[] num = new int[3];
     num[0] = 11;
        num[1] = 22;
        num[2] = 33;

        for (int x = 0; x <num.length; x++) {

            System.out.println(x);
        }
        System.out.println(Arrays.toString(num));
        System.out.println(num.length/2);

    }
}
