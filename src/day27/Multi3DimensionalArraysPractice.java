package day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multi3DimensionalArraysPractice {

    public static void main(String[] args) {

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        int[] a = {1, 2, 3, 4, 5};
        List arrayList = null;
        for (int i = 0; i < a.length; i++) {
            arrayList = Arrays.asList(a[i]);

        }
        System.out.println(arrayList);
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }

            }


        }//System.out.println(Arrays.deepToString(arr3D));
    }
}
