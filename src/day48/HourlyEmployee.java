package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numOfHrs;


    public HourlyEmployee(String name, int id, int hourlyWage, int numOfHrs) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numOfHrs = numOfHrs;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println(name + "'s weekly salary is " + (hourlyWage*numOfHrs));
    }

    @Override
    public String toString() {
        return "HourlyEmployee {" +
                " hourlyWage = " + hourlyWage +
                ", numOfHrs = " + numOfHrs +
                ", name = '" + name + '\'' +
                ", id = " + id + " yearly salary = "+ (hourlyWage*numOfHrs) +
                '}';
    }
}
