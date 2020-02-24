package tasks.task_3_Muhtar;

public abstract class Employees {
    String employeeName, JobTitle;
    int employeeID;

    public Employees(String employeeName, String jobTitle, int employeeID) {
        this.employeeName = employeeName;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
    }

    public abstract void working();
}
