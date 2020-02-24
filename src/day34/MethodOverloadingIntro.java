package day34;

public class MethodOverloadingIntro {
    public static void main(String[] args) {


        System.out.println("Method overloading");
        System.out.println(12);

        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 1));
        System.out.println("=============================");
        sayHello("bud");
        sayHello(99);
        sayHello(9);
        System.out.println(sayHello("Najeeb", "Sohrabi"));
    }

    public static void sayHello(){
        System.out.println("Hi");
    }
    public static void sayHello(String name){

        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num){
        System.out.println("Hello, " + num);
    }

    public static String sayHello(String firstName, String lastName){
        return "Hello, " + firstName + " " + lastName;
    }
}
