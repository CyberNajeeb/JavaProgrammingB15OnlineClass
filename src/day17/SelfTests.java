package day17;

public class SelfTests {
    public static void main(String[] args) {

        String name = "najeeb";
        String name2 = "Najeeb";
        String nameFixed = (name.charAt(0) + "").toUpperCase();

        nameFixed += name.substring(1);
        System.out.println(nameFixed);
    }
}
