package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] allWords = sentence.split(" ");
        System.out.println("all Words to String = " + Arrays.toString(allWords));

        System.out.println("allWords length = " + allWords.length);

        // to print the last word in the sentence
        System.out.println("Last word in the sentence = " + allWords [allWords.length-1]);

        String sentence2 = "Everything is Awesome";
        String[] splitBy_e_Array = sentence2.split("e");
        System.out.println("splitBy_e_Array = " + Arrays.toString(splitBy_e_Array));

        for (String  eachPieces : splitBy_e_Array){
            System.out.println("eachPieces = <" + eachPieces + ">");

        }
    }
}
