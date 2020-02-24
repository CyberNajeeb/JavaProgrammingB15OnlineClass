package day58;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before Try/Catch");
        try {
            System.out.println("Hello, wrong data type!");
            String notString = null;
            System.out.println(notString.length());
            System.out.println("test");
        }catch (Exception e){
            System.out.println("What happened!?");
        }
        System.out.println("After the fact...");

        try {
            System.out.println("Hello, wrong data type!");
            String notString = null;
            System.out.println(notString.length());
            System.out.println("test");
        }catch (Exception e){
            System.out.println("What happened!?");
        }
        finally {
            System.out.println("... It happened to me");
        }
    }
}
