package day16;

public class PreviousDayReview_ReversingAStringCharacters {

    public static void main(String[] args) {

        String word1 = "Mohd";
        String word2 = "";

        word2 +=  word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1)
                + word1.charAt(0);
        System.out.println("word2 = " + word2);
        
        String message = "Hello";
        message += " Hi";
        System.out.println("message = " + message);
    }
}
