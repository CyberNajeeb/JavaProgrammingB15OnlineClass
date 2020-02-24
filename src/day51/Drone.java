package day51;

public class Drone implements UprightFlyable{

    @Override
    public void flyUpright() {
        System.out.println("Flying Upright");
    }

    @Override
    public void fly() {
        System.out.println("Flying normally");
    }
}
