package day22;

public class CanvasDayModuleLinkGenerator {

    public static void main(String[] args) {

        String baseUrl = "https://cybertekschool.okta.com/app/UserHome";
        String dayMsg = "This will lead you to day ";

        for (int day = 1; day<=56; day++){
            System.out.println(dayMsg+day);
            System.out.println(baseUrl + (day + 3296));

        }
    }
}
