package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentence with three words, get the second word

        // Steps:
        // second word is between first space and last space

        //Getting location of space reminds me of indexOf



        String sentence = "I Love Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);
        System.out.println(sentence.substring(2,6));

        secondWord = sentence.substring(firstSpaceIndex + 1 , lastSpaceIndex);

        System.out.println("secondWord = " + secondWord);

        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        String lastWord = sentence.substring(lastSpaceIndex);
        System.out.println("lastWord = " + lastWord + 1);
    }
}
