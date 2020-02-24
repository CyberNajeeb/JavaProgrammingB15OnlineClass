package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        //Above line is the same as Map<String, Double> groceryPriceMap = new HashMap<>();
        //except that this maintains the insertion order.

        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        groceryPriceMap.forEach((name, price)->System.out.println(name + price));

    }

}