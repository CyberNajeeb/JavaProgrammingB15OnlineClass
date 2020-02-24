package tasks;

public class DoWhileAtLeastRunOnce {
    public static void main(String[] args) {

        int x = 1000;

        do {
            System.out.println("Do Do Do");

        }while (x<5);

        System.out.println("The End");

        while (x<5) {
            System.out.println("Same thing.");
        }
    }
}
