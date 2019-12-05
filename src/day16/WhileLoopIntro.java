package day16;

import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {

        int count = 1;
        System.out.println("Hello World!");
        ++count;
        System.out.println("Hello World!");
        ++count;
        System.out.println("Hello World!");
        ++count;
        System.out.println("Hello World!");
        ++count;
        System.out.println("Hello World!");
        System.out.println("Count is " + count);
        System.out.println("------------");

        int cnt = 1;
        while (cnt<=5){
            System.out.println("Hello");
            cnt = cnt + 1;
        }
    }
}
