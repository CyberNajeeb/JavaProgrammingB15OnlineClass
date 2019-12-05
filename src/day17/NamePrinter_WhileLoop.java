package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        String name = "Mohammed Najeeb Sohrabi";

        int x = 0;

        while (x < name.length()) {
            System.out.print("Index " + x + " : ");
            System.out.println(name.charAt(x));
            ++x;
        }

    }
}
