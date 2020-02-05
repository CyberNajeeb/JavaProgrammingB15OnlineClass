package day27;

public class MultiDimensionalArraysPractice {

    public static void main(String[] args) {

        String[] developersTeam = {"Kalbi", "Maqsood", "Torkhami"};
        String[] testersTeam = {"Mula gak", "Shad Gul", "Fateh"};
        String[] businessAnalystTeam = {"Shah Wali", "Qotaan", "Lenin"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam};

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";

        for (String[] each1DArray : scrumTeam){
            for (String eachElement : each1DArray){
                if (maxLength < eachElement.length()){
                    maxLength = eachElement.length();
                    longestString = eachElement;

                }
            }
        }
        System.out.println("maxLength = " + maxLength);
        System.out.println("longestString = " + longestString);
        for (String[] each1DArray : scrumTeam){

        }
    }
}
