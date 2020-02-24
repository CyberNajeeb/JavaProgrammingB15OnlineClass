package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTask {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();
        for (Map.Entry<String, Double> each : entryView) {
//            if (each.getValue()==1.99){
//                each.setValue(15.00);
//            }
            //Above can be used to set the value by referring to current value
            if (each.getKey().length()==5){
                each.setValue(15.00);
            }
        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}