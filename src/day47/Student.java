package day47;

public class Student {
    final int studentID;
    final static String SCHOOL = "Cybertek";

    public Student(int studentID) {
        this.studentID = studentID;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", school='" + SCHOOL + '\'' +
                '}';
    }
}
