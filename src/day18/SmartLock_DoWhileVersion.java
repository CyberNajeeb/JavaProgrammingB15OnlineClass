package day18;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class SmartLock_DoWhileVersion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Knock Knock");
        String password;

        do {
            System.out.println("Whats the password?");

            password = sc.next();

        }while (!password.equals("B15"));
        System.out.println("Door is open");
    }
}
