package day20;

public class SumOfEvenOddSeparately {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int money = 10; money <=100; money++){
            if (money %2==0) {
                sumOfEven += money;
            }else {
                sumOfOdd += money;

            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
