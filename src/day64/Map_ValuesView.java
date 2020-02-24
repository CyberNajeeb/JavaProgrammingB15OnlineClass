package day64;

import java.util.*;

public class Map_ValuesView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("groceryPriceMap = " + groceryPriceMap.get("Tomato"));
        System.out.println("allPrices = " + allPrices);
    }


}