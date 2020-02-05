package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name = "Najeeb Sohrabi";
//        int charCount = name.length();
//        int lastCharIndex = charCount-1;
//
//        for (int x = 0; x < name.length(); x++) {
//
//            char currentChar = name.charAt(x);
//
//
//            if (currentChar == 'h') {
//                System.out.println("Found it");
//                break;
//            }
//
//            System.out.println(currentChar);
//        }


        for (int x = 0; x < name.length(); x++) {

            String currentChar = name.substring(x, x + 1);

            if (currentChar.equalsIgnoreCase("i")){
                System.out.println("Found it");
                break;
            }
        }
    }
}