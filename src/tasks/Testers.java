package tasks;

public class Testers extends ScrumTeam{

    public Testers(String employeeName, String jobTitle, int salary) {
        super(employeeName, jobTitle, salary);
    }
//    ScrumTeam t1 = new Testers("Najeeb", "SDET", 156000);
//    ScrumTeam t2 = new Testers("Arman", "Senior SDET", 199000);
    public void findBug(){
        System.out.println("Ten bugs found");
    }

    @Override
    public void Demo() {

    }

    @Override
    public void DailyStandUp() {

    }

    @Override
    public String toString() {
        return "Testers{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
