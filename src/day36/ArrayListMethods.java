package day36;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();
        lst.add(234l);
        lst.add(456l);
        lst.add(678l);
        System.out.println("lst = " + lst);
        System.out.println("lst.size() = " + lst.size());

        long sum = 0;
        System.out.println(lst.get(0));

        for (int i = 0; i < lst.size(); i++) {

            System.out.println("sum of lst = " + lst.get(i));
        }
        for (int i = 0; i < lst.size(); i++) {
            sum = sum + lst.get(i);

        }
        System.out.println("sum = " + sum);

        long max = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i)>max){
                max=lst.get(i);
            }

        }
        System.out.println("max = " + max);
    }
}
