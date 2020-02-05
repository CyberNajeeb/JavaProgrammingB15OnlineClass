package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = "Superman_Clark Kent";

        //String heroX = " Superman**********";

        //Given a String with hero code and name separated by --
        // turn this String into hero code and * with same length as hero name

        // Plain logic:
        // split it by length of full name
        // generate stars with same length as full name
        // concatenate Herocode with dash and stars and save it.

        // Or when the stars is generated, replace full name with Stars.

     //   String[] heroSplitted = hero1.split("-");
        //String heroCode = heroSplitted[0];
        //String fullName = heroSplitted[1];

        String stars = "";
        for (int i = 1; i <hero1.split("-")[0].length(); i++)
            stars += "*";



        //System.out.println("stars = " + stars);

        String heroX = hero1.replace(hero1.split("-")[0], stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);
    }
}
