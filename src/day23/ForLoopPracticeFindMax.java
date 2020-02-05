package day23;

public class ForLoopPracticeFindMax {

    public static void main(String[] args) {

        double[] mySalaries = {100000.00D, 120000.00D, 150000.00D};

        double maxSalary = mySalaries[0];

        for (double mySalaryRange : mySalaries) {

            if (mySalaryRange > maxSalary){
                maxSalary = mySalaryRange;
            }

            System.out.println("my Max Salary = " + maxSalary);
        }
    }
}