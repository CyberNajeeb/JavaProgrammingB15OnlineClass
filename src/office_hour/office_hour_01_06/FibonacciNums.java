package office_hour.office_hour_01_06;

public class FibonacciNums {

    public static void fib(int num) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;

        if (num == 0) {
            result = result;
        }
        if (num == 1) {
            result = 1;
        }
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

        for (int i = 2; i <= num; i++) {
            result = num2 + num1;
            num1 = num2;
            num2 = result;

        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        fib(2);
    }
}
