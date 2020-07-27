package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringArrayPractice {

    public static void main(String[] args) {
        arr();

        String[] shows = {"Breaking Bad", "Punisher", "The Ranch", "The Morning Show"};

        int showsCount = shows.length;

        int showsInReverseOrder = shows.length - 1;

        System.out.println("shows Count is = " + showsCount);

        for (int i = showsInReverseOrder; i >= 0; i--) {

            System.out.println(shows[i]);


        }

    }

    public static void arr() {
        String[] shows = new String[]{"Breaking Bad", "Punisher", "The Ranch", "The Morning Show"};
        List<String> list = new ArrayList<>(Arrays.asList(shows));
        Predicate<String> stringPredicate = p -> p.startsWith("The");
        list.removeIf(blabla -> blabla.contains("The"));
        System.out.println("list = " + list);


    }
}
