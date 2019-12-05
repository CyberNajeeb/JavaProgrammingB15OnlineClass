package day05_Practice;

import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you recording?");

        boolean isRecording = input.nextBoolean();

        // The result of concatenating a string to any type
        System.out.println("We are recording " + isRecording);

    }
}
