package AdHocPractice;

public class Class_2 {
    public static void main(String[] args) {

//        primeNums(100);
        System.out.println("armstrong(153) = " + isArmstrong(152));
        System.out.println("isPalindrome(121) = " + isPalindrome(122));
    }

    public static void primeNums(int num) {
        if (num == 1) System.out.println(1);
        if (num == 2) System.out.println(2);

        for (int i = 3; i <= num; i++) {
            if (num % i == 1) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        String number = String.valueOf(num);
        int power = number.length();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.charAt(i) + "");
            sum += Math.pow(digit, power);

        }
        return sum == num;
    }

    public static boolean isPalindrome(int num) {
        int result = num;
        long rev = 0;

        while (result != 0) {
            long digit = result % 10;
            rev = rev * 10 + digit;
            result /= 10;

        }

        return num == rev;
    }
}
