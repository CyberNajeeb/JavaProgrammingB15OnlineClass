package day45;

public class ElectricCar extends Car {

    public ElectricCar(){
        super();
        System.out.println("ElectricCar method");

    }

    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar();
    }
}
