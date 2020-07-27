package day64;

import java.util.*;

public class IteratingOverMapUsingLambda {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.put("Orange", 1.89);

        groceryPriceMap.forEach((name, price) -> System.out.println(name + price));

        System.out.println("Byte " + Byte.MAX_VALUE);
        System.out.println("Float  " + Float.MAX_VALUE);
        System.out.println("Short " + Short.MAX_VALUE);
        System.out.println("Int " + Integer.MAX_VALUE);
        System.out.println("Long " + Long.MAX_VALUE);
        System.out.println("Double " + Double.MAX_VALUE);
        System.out.println("Char " + Character.MAX_VALUE);

        stringReverse("Zaki");

    }


    public static void stringReverse(String rev) {
        StringBuffer stringBuffer = new StringBuffer(rev);
        System.out.println(stringBuffer.reverse());
    }

    public void arr(String arrays) {

    }

}