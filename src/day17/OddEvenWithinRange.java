package day17;

public class OddEvenWithinRange {
    public static void main(String[] args) {

//        int cnt = 0;
//        while (cnt<=50){
//            System.out.print(cnt);
//            cnt += 2;
//            System.out.print("------------------------");

        int cnt2 = 1;
        while (cnt2 <= 50) {
            System.out.println(cnt2 + " ");
            cnt2 += 2;

            int cnt3 = 0;

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even");

            } else {
                System.out.println(cnt3 + " is odd");
            }
            while (cnt3 <= 50) {

                if (cnt3 % 2 == 0) {
                    System.out.println(cnt3 + " is even");
                } else {
                    System.out.println(cnt3 + " is odd");
                }
                ++cnt3;
            }
        }
    }

}
