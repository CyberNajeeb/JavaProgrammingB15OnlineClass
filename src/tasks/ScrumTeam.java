package tasks;

public abstract class ScrumTeam {
    String employeeName, jobTitle;
    int salary;

    public ScrumTeam(String employeeName, String jobTitle, int salary) {
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void Demo();
    public abstract void DailyStandUp();

    public void employeeInfo(){
        System.out.println(employeeName + " " + jobTitle + " " + salary);
    }
}
