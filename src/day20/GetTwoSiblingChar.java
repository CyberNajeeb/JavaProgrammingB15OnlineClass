package day20;

public class GetTwoSiblingChar {
    public static void main(String[] args) {
       String name = "Najeeb";
        int charCount = name.length()-1;

        for (int x = 0; x<=charCount-1; x++){



       // charCount+=2;
        System.out.println(name.substring(x,x+2));

    }
        System.out.println("-------------------------");

        // ========GETTING THREE CHARACTERS INSTEAD OF TWO ABOVE==========
        //String name = "Najeeb";
        //int charCount = name.length() - 1;

        for (int x = 0; x <= charCount - 2; x++) {


            // charCount+=2;
            System.out.println(name.substring(x, x + 3));
        }
    }
}