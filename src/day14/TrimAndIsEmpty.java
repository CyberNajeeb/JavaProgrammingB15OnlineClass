package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "   Repl is coming  ";
        System.out.println(message);
        System.out.println(message.length());

        System.out.println(message.trim());
        System.out.println(message);
        message = message.trim();
        System.out.println(message);
        
    }
}
