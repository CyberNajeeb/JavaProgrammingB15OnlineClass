package day26;

public class SplitPractice {

    public static void main(String[] args) {

        String survey = "Do the survey!";
        char[] surveyChars = survey.toCharArray();

        for ( char each : surveyChars) {
            System.out.print(each + "");

        }

        int x = 0;
        while (x < surveyChars.length){

            System.out.print(surveyChars[x]);
            x++;
        }
    }
}
