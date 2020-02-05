package tasks;

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

    }

    @Override
    public void DailyStandUp() {

    }
}
