package day54.interface_as_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility2 {


    public static void main(String[] args) {


        Wearable w1 = new Clothes(36);
        Wearable w2 = new Makeups();
        Wearable w3 = new Watch();
        Wearable w4 = new Perfume();

        Wearable[] myList = {w1, w2, w3, w4};

        List<Wearable> myList2 = new ArrayList<>(Arrays.asList(myList));
        myList2.add(new Clothes(34));
        for (Wearable each : myList2) {

            each.wear();

        }
        System.out.println(myList.getClass().getSimpleName());



    }


}