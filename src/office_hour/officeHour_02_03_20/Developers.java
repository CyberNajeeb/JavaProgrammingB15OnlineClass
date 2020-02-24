package office_hour.officeHour_02_03_20;

public class Developers extends ScrumTeam {

    String jobTitle = "software developer";

    public Developers(String employeeName, String jobTitle, int salary) {
        super(employeeName, jobTitle, salary);
    }

    public void fixingBug(){
        System.out.println("Ten bugs fixed");
    }

    @Override
    public void Demo() {
        System.out.println("Developer name in charge of demo is: " + this.employeeName);

    }

    @Override
    public void DailyStandUp() {
        System.out.println(this.employeeName + " is attending the stand up meeting");

    }
}
