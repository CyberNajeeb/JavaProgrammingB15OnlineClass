package office_hour.officeHour_02_10_20;

public class Student {
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return this.studentName;
    }
}
