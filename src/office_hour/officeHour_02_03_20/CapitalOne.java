package office_hour.officeHour_02_03_20;
import java.util.*;

public class CapitalOne {
    public static void main(String[] args) {

        Testers t1 = new Testers("Najeeb", "SDET", 156000);
        //t1.employeeInfo();
        Testers t2 = new Testers("Arman", "Senior SDET", 199000);
        //t2.employeeInfo();

        //        testers.add(new Testers("Sam", "Digital Auditor", 87000));
//        testers.add(new Testers("Zak", "QA", 147000));
        List<Testers> testers = new ArrayList<>(Arrays.asList(t1, t2));
        for (Testers tester : testers) {
            tester.getEmployeeInfo();
            tester.DailyStandUp();
            tester.Demo();
            tester.findBug();
            System.out.println("=====================");

        }
        Developers d1 = new Developers("Sohrabi", "Engineer", 126000);
        Developers d2 = new Developers("Sultan", "DevOps", 196000);

        List<Developers> developers = Arrays.asList(d1,d2);

        for (Developers each : developers){
            each.getEmployeeInfo();
            each.DailyStandUp();
            each.Demo();
            each.fixingBug();
            System.out.println("=====================");
        }
    }
}