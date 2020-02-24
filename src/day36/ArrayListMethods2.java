package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();
        lst.add(234L);
        lst.add(456L);
        lst.add(678L);
        lst.add(2,123L);
        lst.set(3,789L);
        //lst.remove();
        System.out.println("lst = " + lst);
    }
}
