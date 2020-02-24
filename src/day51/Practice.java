package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("ABC");

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(123);
        lst2.add(456);
        lst2.add(789);
        lst2.add(101112);
        lst2.add(131415);

        Collections.sort(lst2);
        System.out.println("lst2 = " + lst2);

    }
}
