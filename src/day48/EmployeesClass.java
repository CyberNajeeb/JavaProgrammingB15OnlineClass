package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesClass {
    public static void main(String[] args) {

        HourlyEmployee e1 = new HourlyEmployee("Najeeb", 123, 13, 40);
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);
        System.out.println();

        FullTimeEmployee e2 = new FullTimeEmployee("Najeeb",123, 13000);
        e2.calculateAnnualSalary();
        System.out.println("e2 = " + e2);

        System.out.println();
        HourlyEmployee e3 = new HourlyEmployee("Roksana", 102, 57, 2080);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        System.out.println();
        FullTimeEmployee e4 = new FullTimeEmployee("Ainura", 103, 10000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);

        System.out.println();
        FullTimeEmployee e5 = new FullTimeEmployee("Dennis", 104, 13000);
        e5.calculateAnnualSalary();
        System.out.println("e5 = " + e5);

        List<Employee> employeesClasses = Arrays.asList(e1, e2, e3, e4, e5);

        System.out.println("employeesClasses = " + employeesClasses);


        // each and every class we create , it will become a data type (reference type)

    }
}
