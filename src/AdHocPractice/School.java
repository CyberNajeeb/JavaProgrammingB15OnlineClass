package AdHocPractice;

import java.util.List;

public class School {
    String schoolName;
    List<Student> AllStudentsList;

    public School(String schoolName, List<Student> allStudentsList) {
        this.schoolName = schoolName;
        AllStudentsList = allStudentsList;
    }
    public void addNewStudent(Student newStudent){
        this.AllStudentsList.add(newStudent);
    }
}
