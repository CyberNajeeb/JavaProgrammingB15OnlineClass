package day11;

public class PrimitiveEqualityCheck {

    public static void main(String[] args) {

        String name = "Najeeb"; // String literal
        String name2 = new String ("Najeeb"); //

        String name3 = "Najeeb";

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);
        System.out.println(name==name3);


    }
}
