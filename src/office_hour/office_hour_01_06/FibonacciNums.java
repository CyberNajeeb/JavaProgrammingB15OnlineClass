package office_hour.office_hour_01_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

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
//        fib(2);
//        main2();
//        main3();
        System.out.println(makeOutWord("<<>>", "word"));
//        System.out.println(fibNums(0));
//        System.out.println(isPalindrome(121));
//        System.out.println(stringToCharacter("teeter"));
//        isNumberOnly("abc1");
    }

    public static int fibNums(int fibNum) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        if (fibNum == 1)
            return 1;
        if (fibNum == 0)
            return 0;
        for (int i = 2; i <= fibNum; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;


        }
        return result;
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        return originalNum == reversedNum;
    }

    public static List<Character> stringToCharacter(String str) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return list;
    }

    public static void isNumberOnly(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(true);
            }
        }
    }

    public static void main2() {
        Scanner s = new Scanner(System.in);


        String in = s.next();
        double price = 0;

        price = (in.equals("burger") || in.equals("chicken") ? 10 : -1);

//        if (in.equals("burger")||in.equals("chicken")) {
//            price = 10.00;
//        } else if (in.equals("soda")) {
//            price = 2.00;
//        }
        System.out.println(price);
    }

    public static void main3() {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        directions(start, end);
    }

    /*
    Write a program that will print out route instructions. Your program should take 2 parameters: start point and
    endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to
    endpoint - display: "start/end(start or end variable!) found".
    Note: you may move only clockwise.
     */
    private static void directions(String start, String end) {
        String directionLetters = (".*[ABCD]*.");

//        String result = ((start.equals("A")) ? (end.equals("D")) ? "right > down > left: " + end + " found": "": "");
        String result = "";
        //if (start.matches(directionLetters) && end.matches(directionLetters)) {
        if (start.equals(end)) System.out.println(end + " found");
        if (start.equals("A") && end.equals("D")) result = "right > down > left: " + end + " found";
        if (start.equals("A") && end.equals("B")) result = "right: " + end + " found";
        if (start.equals("A") && end.equals("C")) result = "right > down: " + end + " found";
        if (start.equals("B") && end.equals("D")) result = "down > left: " + end + " found";
        if (start.equals("B") && end.equals("A")) result = "down > left > up: " + end + " found";
        if (start.equals("B") && end.equals("C")) result = "down: " + end + " found";
        if (start.equals("C") && end.equals("D")) result = "left: " + end + " found";
        if (start.equals("C") && end.equals("B")) result = "left > up > right: " + end + " found";
        if (start.equals("D") && end.equals("A")) result = "up: " + end + " found";
        if (start.equals("D") && end.equals("B")) result = "up > right: " + end + " found";
        if (start.equals("D") && end.equals("C")) result = "up > right > down: " + end + " found";
//        result = (start.equals("D") ? (end.equals("C")) ? "up > right > down: " + end + " found" : "" : "");

        System.out.print(result);
    }

    public static String makeOutWord(String out, String word) {
        String result = "";
//        for (int i = 0; i < out.length(); i++) {
//            for (int j = 0; j < word.length(); j++) {
        result = out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
//            }
//        }
        return result;
    }

    public String conCat(String a, String b) {
        if (a.charAt(a.length() - 1) == b.charAt(0))
            b = b.replace(b.charAt(0) + "", "");
        return a.concat(b);
    }
}
