package office_hour.officeHour_02_03_20;

public abstract class ScrumTeam {
    String employeeName, jobTitle;
    double salary;

    public ScrumTeam(String employeeName, String jobTitle, int salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void Demo();
    public abstract void DailyStandUp();

    public void getEmployeeInfo(){
        System.out.println("Employee Name: "+employeeName + "\nEmployee job title: "
                + jobTitle + "\nEmployee salary " + salary);
    }
}
