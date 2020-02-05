package day31;

import day30.CarInventory_1000Count;

public class Greeting {

    public static void main(String[] args) {
        sayHello();
        sayHello2(" Najeeb");
        sayHello2(" Arman");
    }
    public static void sayHello2( String names){
        System.out.println("Hello, " + names);
    }
    public static void sayHello(){

        System.out.println("Hello, Hasan");
    }
}
