package day40;

import java.util.ArrayList;

public class HotMarketActions {
    public static void main(String[] args) {
        Offers myOffers = new Offers();

        myOffers.location = "Los Angeles";
        myOffers.company = "Deloitte";
        myOffers.isFullTime = true;
        myOffers.salary = 147000;
        myOffers.displaySalaryInformation();

        Offers futureOffers = new Offers();
        futureOffers.displaySalaryInformation();

        ArrayList<Offers> myOffersList = new ArrayList<>();

        myOffersList.add(myOffers);

        System.out.println("myOffers ------------------");

        for (Offers offer : myOffersList) {


            offer.displaySalaryInformation();
        }

        System.out.println("myOffers ------for loop------------");

        for (int x = 0; x < myOffersList.size(); x++) {

            // store each item to a variable each
            Offers each = myOffersList.get(x);
            each.displaySalaryInformation();
            // This is the one shot version
            //myOffers.get(x).displayInformation();

        }

    }
}