package day40;

public class Offers {

    String location, company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information
     * about Offer object no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displaySalaryInformation() {
        System.out.println("location " + location + " company "
                + company + " salary " + salary + " isFullTime " + isFullTime);

    }

    public void turnToFullTime() {
        if (!isFullTime) {
            isFullTime = true;
        }
    }

    public void changeLocation(String newLocation) {
        location = newLocation;
    }

    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newLocation, String newCompany,
                              long newSalary, boolean newIsFullTime) {
        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
    }
    public boolean is100KOffer(){
        return salary>100000;
    }

    @Override
    public String toString() {
        return "Offers{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}