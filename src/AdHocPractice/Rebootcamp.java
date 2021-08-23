package AdHocPractice;

import java.util.Arrays;
import java.util.List;

public class Rebootcamp {

    public static void main(String[] args) {

    }

    public static boolean primeNumber(int num) {
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
        // 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
        boolean result = false;
        if (num <= 1) {
            return result;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                //System.out.println(result);
                return true;
            }
        }
        return result;
    }

    public static void isPalindrome(String s) {
        String result = "";
        s = s.replace(" ", "");
        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);
        if (s.equalsIgnoreCase(result))
            System.out.println("\"" + s + "\" is palindrome");
        else
            System.out.println("\"" + s + "\" is not palindrome");
    }

    public static boolean passwordValidation(String password) {
        boolean valid = false;
        String lowerCase = "(.*[a-z]*.)";
        String upperCase = "(.*[A-Z]*.)";
        String numbers = "(.*[0-9]*.)";
        String specialChars = "(.*[-/,:-@]*.)";

        boolean hasLower = password.matches(lowerCase);
        boolean hasUpper = password.matches(upperCase);
        boolean hasNumber = password.matches(numbers);
        boolean hasSpecial = password.matches(specialChars);

        if (password.length() >= 6 && !password.contains(" "))
            if (hasLower && hasUpper && hasSpecial && hasNumber)
                valid = true;
        return valid;
    }
}