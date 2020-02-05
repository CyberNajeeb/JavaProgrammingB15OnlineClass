package day22;

public class LoopControlStatementWithMain {

    public static void main(String[] args) {
//                       01234567890
        String myName = "kOsHtAmShEpEsHeShEpEsHkOsHeKaShMaKaShEsHaShPaRa";

        for (int i = 0; i <=myName.length()-1; i++) {
            if (i%2!=0){
                continue;
            }

            System.out.println(myName.charAt(i));
        }
    }
}
