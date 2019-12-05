package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        String dogLocation = "I like Dogs. Dogs are good companions";

        int lastCharIndex = dogLocation.length()-1;

        for (int x = 0; x <= lastCharIndex-2; x++){

            String currentThreeChar = dogLocation.substring(x,x+3);
            System.out.println(x + " : " + currentThreeChar);

            if (currentThreeChar.equals("Dog")){
                System.out.println("BINGO AT " + x);
            }
        }

        //System.out.println(dogLocation.substring());
    }
}
