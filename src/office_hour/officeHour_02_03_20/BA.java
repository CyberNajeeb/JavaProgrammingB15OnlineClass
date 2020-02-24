package office_hour.officeHour_02_03_20;

public class BA extends ScrumTeam {

    /*
    inherited features:
            employeeName, jobTitle, salary
            getEmployeeInfo
     */
    public BA(String employeeName, double salary) {
        super("Naj", "SDET", 999);
        this.jobTitle = " Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;
    }


    @Override
    public void Demo() {
        System.out.println("Business Analyst " + this.employeeName + " is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Business Analyst " + this.employeeName + " attended the daily stand up");
    }

    public void gatherRequ() {
        System.out.println("Business Analyst " + this.employeeName + " is gathering the requiremnts");
    }

}