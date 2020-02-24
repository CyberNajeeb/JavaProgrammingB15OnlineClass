package tasks;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName = "Najeeb Sohrabi";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

       // for (int x = 0; x < lastCharIndex; x++) {

        // find out index of all the letter in a case sensitive manner
        // I will go through each and every character, I will check whether
        //the character I'm looking at equals A or a. --> currentChar.equalsIgnoreCase(a)
        //If it does equal, I will print the index, otherwise I will move on until
        // i reach the next desired character. If I go over last character index, I stop.

       // }
        System.out.println("---1 char---");

        for (int x = 0; x <= lastCharIndex; x++) {
            String currentChar = myName.substring(x, x+1);

            if (currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of A or a is " + x);
            }

        }
    }
}