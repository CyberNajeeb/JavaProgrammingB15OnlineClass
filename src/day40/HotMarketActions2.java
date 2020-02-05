package day40;

import java.util.ArrayList;

public class HotMarketActions2 {
    public static void main(String[] args) {
        Offers myOffers = new Offers();
        Offers o1 = new Offers();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displaySalaryInformation();

        Offers o2 = new Offers();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displaySalaryInformation();

        Offers o3 = new Offers();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displaySalaryInformation();

        myOffers.location = "Los Angeles";
        myOffers.company = "Deloitte";
        myOffers.isFullTime = true;
        myOffers.salary = 147000;
        //myOffers.displaySalaryInformation();
        myOffers.changeLocation("D.C.");
        System.out.println("myOffers = " + myOffers);

        Offers futureOffers = new Offers();
        futureOffers = myOffers;
        futureOffers.displaySalaryInformation();
        futureOffers.turnToFullTime();

        futureOffers.salary = myOffers.salary + 3000;
        futureOffers.displaySalaryInformation();
    }
}