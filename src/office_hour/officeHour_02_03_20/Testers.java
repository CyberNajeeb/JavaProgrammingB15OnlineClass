package office_hour.officeHour_02_03_20;

public class Testers extends ScrumTeam {

    public Testers(String employeeName, String jobTitle, int salary) {
        super(employeeName, jobTitle, salary);
    }
    public void findBug(){
        System.out.println(this.employeeName + " found ten bugs");
    }

    @Override
    public void Demo() {
        System.out.println(this.employeeName + " is in charge of demo");
    }
    @Override
    public void DailyStandUp() {
        System.out.println(this.employeeName + " is attending the stand up meeting");
    }

}
