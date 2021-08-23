package AdHocPractice;

import java.util.Arrays;

public class MoveZerosToTheEndOfArray {

    public static void main(String[] args) {
        // movingZeros(new int[] {1,2,8,0,5,0,0,9});
//        inPlaceArraySwapping(new int[]{1,2,8,0,5,0,0,9});
        arrayCombination(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    public static void movingZeros(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void inPlaceArraySwapping(int[] arr2) {
        int i, j = 0;
        for (i = 0; i < arr2.length && j < arr2.length; j++) {
            if (arr2[j] != 0) {
                int temp = arr2[i];
                arr2[i++] = arr2[j];
                arr2[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void arrayCombination(int[] arr1, int[] arr2) {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int[] res = new int[arr1Len + arr2Len];
        System.arraycopy(arr1, 0, res, 0, 3);
        System.arraycopy(arr2, 0, res, arr1Len, arr2Len);
        System.out.println(Arrays.toString(res));
    }
}
