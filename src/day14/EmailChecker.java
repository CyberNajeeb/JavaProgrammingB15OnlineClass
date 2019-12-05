package day14;

import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an email address:");
        String email = sc.next();
        if (!email.contains("@") || (email.contains(" "))) {
            System.out.println("Invalid email address");
        }else if (email.endsWith("@gmail.com")) {
            System.out.println("G-mail");
        }else if (email.endsWith("hotmail.com")) {
                    System.out.println("hotmail");
                }else {
                    System.out.println("Please enter an email address:");
                }
            }
        }

