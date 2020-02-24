package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {


        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
        states.remove("GA");
        System.out.println("states after  = " + states);



    }


}