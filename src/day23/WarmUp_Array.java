package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};
        int lastItem = num.length-1;

        for (int x = lastItem; x >=0; x--) {
            System.out.println(num[x]);


        }System.out.println(num.length/2);
        System.out.println();
        for (int j = 0; j <=num.length-1; j++) {
            System.out.println(num[j]);

        }
    }
}
