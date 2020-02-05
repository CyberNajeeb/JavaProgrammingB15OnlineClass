package day31;

public class SeasonChecker {

    public static void main(String[] args) {
        decideSeasonAction("winter");
        decideSeasonAction("summer");
        decideSeasonAction("fall");
        decideSeasonAction("spring");

    }
    public static void decideSeasonAction (String season){
        switch (season){
            case "summer":
                System.out.println("Sunbathe");
                break;
            case "fall":
                System.out.println("Walk in the park");
                break;
            case "winter":
                System.out.println("Keep warm");
                break;
            case "spring":
                System.out.println("Chill");
                break;
            default:
                System.out.println("No seasons, where you live?");
        }
    }
}
