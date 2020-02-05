package day21;

import javax.swing.*;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {
        String myName = "Najeeb Sohrabi";
        int charCount = myName.length() - 1;
        int lastCharIndex = charCount - 1;

        for (int x = 0; x <= lastCharIndex; x++) {

            //myName = myName.substring(0);

            //System.out.print(myName.charAt(x) + "-->");
            System.out.print(myName.substring(x, x+1) + "-->");

        }
        System.out.println();
            // for two character printout
        for (int x = 0; x < charCount; x++) {
            String twoChar = myName.substring(x, x+2);
            System.out.println(twoChar);

        }
        System.out.println();
            // for three character printout
        for (int x = 0; x < charCount; x++) {
            String twoChar = myName.substring(x, x+3);
            System.out.println(twoChar);

        }
    }

}