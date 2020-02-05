package day27;

public class MultiDimensionalArraysPractice2 {

    public static void main(String[] args) {

        String[] developersTeam = {"Koni", "Kalbi", "Maqsood", "Torkhami"};
        String[] testersTeam = {"Mula gak", "Shad Gul", "Fateh"};
        String[] businessAnalystTeam = {"Shah Wali", "Qotaan", "Lenin"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalystTeam};

       int minLength = scrumTeam[0][0].length();
       String shortestString = scrumTeam[0][0];

        for (int i = 0; i < scrumTeam.length; i++) {
            for (int j = 0; j < scrumTeam[i].length; j++) {
                if (minLength > scrumTeam[i][j].length()){
                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];


                }

            }
        }
        System.out.println("shortestString = " + shortestString);
    }
}
