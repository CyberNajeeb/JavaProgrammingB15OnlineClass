package AdHocPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Repl71 {

    public static double[] timesTen(double[] arr) {
        for (int i = 0; i < arr.length; i++) {


//            for(double[] i : arr){
            arr[i] = i * 10.00;
        }
        return arr;
    }

    public static void main(String[] args) {
        //feel free to test code here
        //System.out.println(timesTen(new double[] {2.0,3.0,4.0}));
        Map<String, String> map = new TreeMap<>();
        map.put("key", "value1");
        System.out.println("map key = " + map.get("key"));
        map.put("key", "value2");
        System.out.println("map key = " + map.get("key"));
    }

}

