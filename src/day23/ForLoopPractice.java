package day23;

public class ForLoopPractice {

    public static void main(String[] args) {

        double[] mySalaries = {100000.00D, 120000.00D, 150000.00D};


        for (double mySalaryRange : mySalaries) {

            if (mySalaryRange<=120000.00){
                continue;
            }

            System.out.println("my Salaries Range = " + mySalaryRange);
        }
    }
}