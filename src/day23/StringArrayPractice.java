package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = { "Breaking Bad", "Punisher", "The Ranch", "The Morning Show"};

        int showsCount = shows.length;

        int showsInReverseOrder = shows.length-1;

        System.out.println("shows Count is = " + showsCount);

        for (int i = showsInReverseOrder; i >=0; i--) {

            System.out.println(shows[i]);

        }

    }
}
