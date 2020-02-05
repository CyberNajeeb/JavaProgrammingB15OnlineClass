package day21;

public class OddNumPrinter {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {

                System.out.println("Repeating");

                for (int j = 1; j <= 10; j++) {
                    if (j % 2 == 0) {
                        continue;


                    }System.out.println("Odd Numbers Are : " + j);
                }

            }
        }
    }}
