package tasks;

public class CalculateGrades {
    public static void main(String[] args) {
        grades(89);


    }

    public static int grades(int grade) {
        char letterGrade = 'A';
        if (grade > 89 && grade < 101) {
            letterGrade = 'A';
        } else if (grade > 79 && grade < 90) {
            letterGrade = 'B';
        } else if (grade > 69 && grade < 80) {
            letterGrade = 'C';
        } else if (grade > 59 && grade < 70) {
            letterGrade = 'D';
        } else if (grade >= 0 && grade < 60) {
            letterGrade = 'F';
        } else {
            System.out.println("Invalid Score!");

        }
        System.out.println(letterGrade);
        return 0;
    }
}

