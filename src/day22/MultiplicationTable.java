package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Multiplication by 1
        for (int base = 1; base < +12; base++) {

            System.out.println("1 x " + base + " = " + 1 * base);

        }
// Multiplication by 1
        for (int base = 1; base < +12; base++) {

            System.out.println("2 x " + base + " = " + 2 * base);

        }
        // Multiplication by 1
        for (int base = 1; base < +12; base++) {

            System.out.println("3 x " + base + " = " + 3 * base);

        }

            // Lines 28 & 29 repeat something for 10 times, in this case, multiplication table.

        for (int timesTable = 1; timesTable < 10; timesTable++) {
            System.out.println("Multiplication Table of " + timesTable);

            // This loop multiplies numbers by one number
            for (int base = 1; base < +12; base++) {

                System.out.println(timesTable + " x " + base + " = " + timesTable * base);

            }
        }
    }
}