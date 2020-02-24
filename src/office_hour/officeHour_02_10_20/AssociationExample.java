package office_hour.officeHour_02_10_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociationExample {
    public static void main(String[] args) {

        Student s1 = new Student("Celeste");
        Student s2 = new Student("Chris");
        Student s3 = new Student("Oz");
        Student s4 = new Student("Isabel");
        Student s5 = new Student("Wilson");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println("list = " + list);

        School Cybertek = new School("Cybertek", list);
        Cybertek.addNewStudent(new Student("Daniel"));
        Cybertek.addNewStudent(new Student("Natalie"));

        for (Student eachStudent : Cybertek.allStudentList){
            System.out.println(eachStudent.studentName);
        }

        Student[] students = { new Student  ("Abdul"), (new Student("Hadi"))};
        System.out.println("students = " + Arrays.toString(students));
    }
}
