package day63;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        List<String> membersNames = new ArrayList<>();

        membersNames.addAll(Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like",
                "Aytem", "Yerkhanat"));
        Map<String, Integer> nameCharCountPair = new HashMap<>();

        for (String eachMamber : membersNames) {
            nameCharCountPair.put(eachMamber, eachMamber.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);
    }
}
