package office_hour.officeHour_02_10_20;

import java.util.Arrays;
import java.util.List;

public class School {
    String schoolName;

    List<Student> allStudentList;

    public School(String schoolName, List<Student> allStudentList) {
        this.schoolName = schoolName;
        this.allStudentList = allStudentList;
    }
    public void addNewStudent(Student newStudent){
        this.allStudentList.add(newStudent);
    }
    public void addManyStudent(Student[] students){
        this.allStudentList.addAll(Arrays.asList(students));
    }
    public void addManyStudent(List<Student> studentsList){
        this.allStudentList.addAll(studentsList);

    }
}
