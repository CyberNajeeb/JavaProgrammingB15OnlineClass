package day49;

public class Tesla extends Vehicle implements Autonomous {

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;

    }

    @Override
    public void selfDrive() {
        System.out.println("My new self-drive car is called Tesla");
    }

    @Override
    public void start() {
        System.out.println("Starting my car");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                " horsePower = " + horsePower +
                ", year = " + year + " model = " + model +
                '}';
    }
}
