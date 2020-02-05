package day48;

// a non-abstract sub class of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.
public class FullTimeEmployee extends Employee {
    int monthlySalary = 13000;
    int annualSalary = monthlySalary*12;

    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
//        this.name = name ;
//        this.id = id ;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println(name + "'s Annual salary is " + monthlySalary*12);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee {" +
                " monthlySalary = " + monthlySalary +
                ", annualSalary = " + annualSalary +
                '}';
    }
}
