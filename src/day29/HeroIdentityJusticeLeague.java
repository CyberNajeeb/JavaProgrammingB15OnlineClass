package day29;

import java.util.Arrays;

public class HeroIdentityJusticeLeague {

    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent", "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana", "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana", "Cyborg-Victor Stone",
                "The Flash-Barry Allen ", "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen", "Atom-Ray Palmer",
                "Hawkman-Carter Hall", "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara", "Martian Manhunter-John Jones"};

        for (String eachHero : allHeroes){

            String hero1 = eachHero;
            String[] heroSplitted = hero1.split("-");
            String heroCode = heroSplitted[0];
            String fullName = heroSplitted[1];
            String stars = "";

            for (int i = 0; i <= fullName.length(); i++) {
                stars += "*";

            }
        System.out.println("each Heroes = " + (eachHero));

    }
    }
}
