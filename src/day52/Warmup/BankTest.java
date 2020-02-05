package day52.Warmup;

import java.util.Arrays;
import java.util.List;

public class BankTest {
    public static void main(String[] args) {

        Account a1 = new Account("Hannah", 10000);
        Account a2 = new Account("Anna", 7000);
        System.out.println("a1 before transfer = " + a1);
        System.out.println("a2 before transfer = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after transfer = " + a1);

        a2.transferAll(a1);
        System.out.println("a1 after transfer = " + a1);
        System.out.println("a2 after transfer = " + a2);

        System.out.println("Is a1 name palindrome = " + a1.isPalindrome());
        System.out.println("Is a2 name palindrome = " + a2.isPalindrome());

        List<Account> lst = Arrays.asList(a1,a2);
        Account a3 = new Account("Daria", 0);
        for (Account each : lst){
            each.transferAll(a3);
        }
        System.out.println("a3 = " + a3);
        System.out.println("lst = " + lst);
    }
}
