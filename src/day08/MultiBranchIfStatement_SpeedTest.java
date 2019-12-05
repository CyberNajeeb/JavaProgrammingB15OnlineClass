package day08;

import java.util.Scanner;

public class MultiBranchIfStatement_SpeedTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell mre your speed.");
        int currentSpeed = sc.nextInt();
        if (currentSpeed > 90) {
            System.out.println("You are speeding. You will get points on your license!");
        } else if (currentSpeed > 80 && currentSpeed < 90) {
            System.out.println("Your speed is over the speed limit by up to 20 mph.");
        }
        else if (currentSpeed > 70 && currentSpeed < 80) {
            System.out.println("Your speed is over the speed limit by up to 10 mph.");
        }
        else if (currentSpeed <= 70) {
            System.out.println("You are a law-abiding citizen, Congratulations!");
        }
        else {
            System.out.println("Please move on with you day!");
        }
    }
}
