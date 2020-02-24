package day61;

// Comparable interface is coming from java.lang package
// in order to sort a type , it has to be Comparable
// so the class of that type must implements Comparable<Type>
// to provide comparing logic , this will become natural order for sorting

// POJO : Plain Old Java Object | Usually used to represent data
public class Job implements Comparable<Job>{
    private String location, companyName;
    private double salary;

    public Job(String location, double salary, String companyName ) {
        this.location = location;
        this.companyName = companyName;
        this.salary = salary;

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobClass{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Job other) {
        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            return 0;
        }
    }
    // BELOW ALSO WORKS, INSTEAD OF THE if()     BLOCK ABOVE!!
    //return Double.compare(this.salary, other.salary);
}
