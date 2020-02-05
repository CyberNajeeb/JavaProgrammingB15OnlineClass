package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        String firstItem = (("Apple Watch,559,21.18"));
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count  = " + productLst.size());


//         * Task 1 : print only items name
        // This is for each version
        for (String eachProduct : productLst) {
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }

        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price = " + price);
            }
        }

        double sum = 0d;
        double avg = 0d;
        for (String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price;
        }
        avg = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);

        for (String eachProduct : productLst) {
            //double price = Double.parseDouble(eachProduct.split(",")[0]);
            String name = eachProduct.split(",")[0];
            double monthlyPmt = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthlyPmt < 20) {
                System.out.println(name + " " + monthlyPmt);
            }
        }

        for (String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthlyPmt = Double.parseDouble(eachProduct.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthlyPmt);
            }
        }
// Task 6
        System.out.println("\n-----------Task 6 ----------with only price");
////         * Task 6 : Print all information about most expensive item.
//
//        // assume first item price is max price before comparing
////        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]) ;
//
////        for (String eachProduct : productLst) {
////
////            double price = Double.parseDouble(eachProduct.split(",")[1]);
////            if(price> maxPrice){
////                maxPrice = price ;
////            }
////
////        }
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("\n-----------Task 6 ----------with product details");
        // above solution will not work
        // because we need the location of max price not the price itself
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;

//         * Task 6 : Print all information about most expensive items.
        for (int i = 0; i < productLst.size(); i++) {

            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            double price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = "
                + productLst.get(maxPriceIndex));


        System.out.println("\n-----------Task 7 ----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {

            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i;
            }
        }

        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);


        System.out.println("\n-----------Task 8 ----------");
//         * Task 8 : Count the items prices more than average price.
        int count = 0;
        for (String eachProduct : productLst) {
            price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > avg) {
                count++;
            }
        }
        System.out.println("count of items prices more than average price = " + count);

        System.out.println("\n-----------Task 9 ----------");
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        for (int i = 0; i < productLst.size(); i++) {
            price = (Double.parseDouble(productLst.get(i).split(",")[1]));
            if (price > avg) {
                productLst.remove(i);
                i--;
            }
        }
        System.out.println("product count after removing = " + productLst.size());


        System.out.println("\n-----------Task 3 ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        System.out.println("item names:");
        for (String s : productLst) {
            ArrayList<String> itemNames = new ArrayList<>(Collections.singleton(s.split(",")[0]));
            System.out.print(itemNames + " ");
        }
        System.out.println("\nitem prices:");
        for (String s : productLst) {
            ArrayList<Double> prices = new ArrayList(Arrays.asList(Collections.singleton(s.split(",")[1])));
            System.out.print(prices + " ");
        }
        System.out.println("\nitem monthly payments:");
        for (String s : productLst) {
            ArrayList<Double> monthlyPayments = new ArrayList(Collections.singleton(s.split(",")[2]));
            System.out.print(monthlyPayments + " ");
        }
//        for (String eachProduct : productLst) {
//            String item1 = "iPhone 6s Plus,549,22.88";
//            itemNames.add(eachProduct.split(",")[0]);
//            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
//            prices.add(pricePart);
//            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
//        }
//            System.out.println("itemNames = " + itemNames);

        }
    }
