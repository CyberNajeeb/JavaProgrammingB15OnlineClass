package day44.sub;

import day44.Vehicle;

    public class Car extends Vehicle {

        // String make is not inherited because
        // it has default access modifier
        // private int year is not inherited !

        int mileage;

        public static void main(String[] args) {


            day44.Car c1 = new day44.Car();
//            c1.mileage = 39637;
//            c1.make = "Totoya Corolla";
//            System.out.println("car 1 make = " + c1.make);
//
//            System.out.println("car 1 mileage = " + c1.mileage);
//            c1.setYear(2016);

            System.out.println("car 1 Year() = " + c1.getYear()) ;

        }

    }
