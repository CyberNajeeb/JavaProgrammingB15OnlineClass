package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman_Clark Kent";
        //Hero code is Superman and the Identity is Clark Kent
        //The initial of the Hero is CK
        String[] splitHeroName = hero1.split("_" );
        String Codename = splitHeroName[0];
        String Identity = splitHeroName[1];
        System.out.println(Arrays.toString(splitHeroName));
        System.out.println("Codename "+splitHeroName[0] + " Identity "+splitHeroName[1]);
        System.out.println(Codename.substring(0,1));
        System.out.print(Identity.substring(0,1));


    }
}
