package day39;

public class Garage2 {

    public static void main(String[] args) {

        CarAtributes myCar = new CarAtributes();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.color = "Metalic gray";
        myCar.year = 2015;
        myCar.printYear();

        CarAtributes mySecondCar = new CarAtributes();
        mySecondCar.make = "Toyota";
        mySecondCar.model = "Corolla";
        mySecondCar.color = "Gray";
        mySecondCar.year = 2016;


        System.out.print(myCar.make + " " + myCar.model+ " and "
                + mySecondCar.make + " " + mySecondCar.model+ " are ");
        myCar.goForward();
    }

}
