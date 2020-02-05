package day49;

public class MainCars {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(2020) {
            @Override
            public void start() {
                System.out.println("Starting the vehicle");
            }
        };
        System.out.println("My new Vehicle year of make is " + v1.year);
        v1.start();
        v1.goForward();
        System.out.println("v1 = " + v1);

        System.out.println("--------------------------------------");

        Tesla ta = new Tesla(2020, 490, "Model X");
        System.out.println("My new Tesla year of make is " + ta.year);
        System.out.println("My car's model is " + ta.model);
        System.out.println("My Tesla horsepower is "+ta.horsePower);
        ta.start();
        ta.selfDrive();
        System.out.println("ta = " + ta);



    }
}
