package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {
//
//        String Najeeb = "name";
//        String name = "Najeeb";
//
//        //System.out.println(Najeeb.equals("Name"));
//
//        String myString = "jAvA";
//        System.out.println(myString.equalsIgnoreCase("Java"));
//
//        System.out.println("Is my string same as your string?");
//        System.out.println(myString.equalsIgnoreCase("Java"));
//
        String myString = "My name";
        String yourString = "Your name";

        if (myString.equals(yourString)) {
            System.out.println("Say Yeeay");
        }else if (myString.equals("My name")) {
            System.out.println("Nice");
        }else if (yourString.equals("Your name")){
            System.out.println("Goood!");
    }else {
            System.out.println("Rellay!?");
        }
    }
}
