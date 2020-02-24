package day62;

import java.util.HashSet;
import java.util.Iterator;

public class SetIntro {
    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();

        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(16);

        Iterator<Integer> integerIterator = integers.iterator();
        int x = integerIterator.next();
        System.out.println(x);
        System.out.println("integers = " + integers);

    }
}
