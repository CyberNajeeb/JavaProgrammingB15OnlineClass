package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<String> lst = new LinkedList<>();
        lst.add("Person 1");
        lst.add("Person 2");
        lst.add("Person 3");
        lst.add("Person 4");
        lst.add("Person 5");

        System.out.println("lst = " + lst);

        lst.remove("Person 2");
        System.out.println("lst = " + lst);
        lst.add(1,"Person 2");
        System.out.println("lst = " + lst);
    }
}
