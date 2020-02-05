package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {

        String sentence = "We are trying to find the longest word";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        String longestWord = "";
        int maxCharCount = 0;

        for ( String currentWord : allWords){
            System.out.println("currentWord = " + currentWord);
            if (currentWord.length()>longestWord.length()){
                longestWord=currentWord;

            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
