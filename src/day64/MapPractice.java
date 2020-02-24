package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, List<String>> groupsMap = new HashMap<>();

        String Achievers[] = {"Muhammed Sohrabi", "Yerkhanat Myedyeukhan",
                "Anastasiya Tiunova", "Ayten Marul", "Dilshat Sadamov", "Like Sha",
                "Maiia Maglakelidze", "Toyly Gurdov","Sayed Z.Miri",
                "Alimujiang Alafate","Brian J.Ingco","Buajieer Yasen"};

        groupsMap.put("Acheivers", new ArrayList<>(Arrays.asList(Achievers)));
        groupsMap.put("PowerOf4" , Arrays.asList("Furkan","Daria","Serife","Muge")  );
        groupsMap.put("BugHunter" , Arrays.asList("Ayse","Rabiyam","Gulzina")  );
        groupsMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));
        //System.out.println("groupMap = " + groupMap);

        groupsMap.forEach((groupCode, allMembers) -> System.out.println("groupCode = " + groupCode + "\n\t members : " + allMembers));
        // get Toyly , he is at index 3
        System.out.println(groupsMap.get("Achievers").get(3));
        // check whether this map has Gulzina or not in BugHunter ?
        // get method from Map | contains method is coming from list
        // because the values are List<String> get method will return the entire List
        System.out.println(groupsMap.get("BugHunter").contains("Gulzina"));
        // we want to add a group entry so we can add or remove members from the group

        groupsMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));
        groupsMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupsMap.get("Justice League"));

        // the key for the Map should be a type Immutable


    }
}