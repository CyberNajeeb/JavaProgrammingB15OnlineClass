package day22;

public class LoopControlStatementWithMain {

    public static void main(String[] args) {
//                       01234567890
        String myName = "kOsHtAmShEpEsHeShEpEsHkOsHeKaShMaKaShEsHaShPaRa";

        for (int i = 0; i < myName.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(myName.charAt(i));
            }
        }
    }
}