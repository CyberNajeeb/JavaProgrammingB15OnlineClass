package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your credentials");

        String userName = sc.nextLine();
        String password = sc.nextLine();
        if (userName.equals("najsoh") && password.equals("bangbangbizhbalabang")) {
            System.out.println("welcome");
        } else if (!userName.equals("najsoh") && password.equals("bangbangbizhbalabang")) {
            System.out.println("wrong username");
        } else if (userName.equals("najsoh") && !password.equals("bangbangbizhbalabang")) {
            System.out.println("Wrong password");
        } else {
            System.out.println("Incorrect username and password");
        }
    }
}
