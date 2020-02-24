package day35;

public class ParsingPractice {
    public static void main(String[] args) {

        String sentence = "I bought 3 tomatoes and the price was 3.14 each";

        String[] allWords = sentence.split(" ");
        int count = Integer.parseInt(allWords[2]);
        String priceString = allWords[allWords.length-2];
        double price = Double.parseDouble(priceString);
        System.out.println("price = " + (count*price));

        //     OR

        System.out.println(Integer.parseInt(allWords[2])*Double.parseDouble(allWords[allWords.length-2]));
    }
}
