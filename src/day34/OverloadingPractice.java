package day34;

public class OverloadingPractice {
    public static void main(String[] args) {

        add(100);
        add(Math.addExact(10,10));
        add(12,12,12);
        add(15L,12L);

    }
    public static void add(int num){
        System.out.println("num = " + num);
    }
    public static void add(int num, int num1){
        System.out.println("num+num1 = " + num+num1);
    }
    public static void add(int num, int num1, int num2){
        System.out.println("num + num1 + num2 = " + (num+num1+num2));
    }
    public static void add(long num, long num1){
        System.out.println("num + num1 = " + (num+num1));
    }
}
