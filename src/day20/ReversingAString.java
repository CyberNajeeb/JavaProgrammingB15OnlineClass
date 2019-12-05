package day20;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name to " +
                "find out the index numbers for each character\n" +
                "and see what your name looks like upside down:");
        String name = sc.nextLine();
        String reversedName = "";
        int lastCharIndex = name.length()-1;

        for (int x = lastCharIndex; x>=0; x--){
            System.out.println("Index number for " + name.charAt(x) + " is " + x);
            //System.out.print(name.charAt(x));
        }
    }
}
