package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        // Creating a HashSet with items already inside

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>( numList  );
        System.out.println("myNumSet = " + myNumSet);

        //String states = "Arizona";
        Set<String> states = new HashSet<>();
        states.add("Arizona");
        states.add("California");
        states.add("Main");
        states.add("NewYork");
        states.add("Virginia");
        states.add("Washington");
        states.add("Nevada");

        HashSet<String> stringHashSet = new HashSet<>(states);

        stringHashSet.forEach(each -> System.out.println("each = " + each));
//        for (String each : stringHashSet){
//            System.out.println("each = " + each);
//        }

    }


}