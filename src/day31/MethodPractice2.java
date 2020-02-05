package day31;

public class MethodPractice2 {

    public static void main(String[] args) {
        Count1To10();
        printOddNumbers1To100();
        countDownFrom20();
        spellMyName();
    }

    public static void Count1To10() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

    }public static void printOddNumbers1To100(){
        for (int i = 1; i < 100; i++) {
            System.out.print(" " + i);

        }

    }public static void countDownFrom20(){
        for (int i = 20; i > 0; i--) {
            System.out.println(" " + i);

        }

    }public static void spellMyName(){
        String myName = "Najeeb";
        for (int i = myName.length()-1; i >= 0; i--) {

            System.out.println("myName = " + myName.charAt(i)+"->");
        }

    }
}