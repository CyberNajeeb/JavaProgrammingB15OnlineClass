package day59;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

//        String name = "Najeeb";
//        System.out.println("name's 100th char is " + name.charAt(100));

        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
        System.out.println("e1 = " + e1.toString());

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Please enter a number between 0 and " + (name.length()-1));
        int input = sc.nextInt();
        try {
            if (input>=0 && input<=name.length()-1){
                System.out.println("The character in position " + input + " of your name is " + name.charAt(input) + ".");

            }else {
                System.out.println("Not a valid number. Please enter a number between 0 and " + (name.length()-1));
                input = sc.nextInt();
            }

        }
        catch (Exception ignored){
        }
    }
}
