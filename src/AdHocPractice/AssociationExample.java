package AdHocPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {


        Student s1 = new Student("Najeeb");
        Student s2 = new Student("Oz");
        Student s3 = new Student("Andrea");
        Student s4 = new Student("Anna");
        Student s5 = new Student("Annie");

        List<Student> CybertekStudents = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        School sc1 = new School("Cybertek", CybertekStudents);
        Student s6 = new Student("Denis");
        Student s7 = new Student("Irina");

        CybertekStudents.add(new Student("Denis"));
        CybertekStudents.add(new Student("Irina"));
        for (Student student : CybertekStudents){
            System.out.println(student.studentName);
        }
    }
}