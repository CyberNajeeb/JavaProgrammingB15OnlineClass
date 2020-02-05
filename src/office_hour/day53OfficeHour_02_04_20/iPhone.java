package office_hour.day53OfficeHour_02_04_20;

public class iPhone extends Device{

    String OS;

    public iPhone(int power, double screenSize, double resolution, int size) {
        super(power, screenSize, resolution, size);
        this.OS = "iOS";
    }

    @Override
    public void screenResolution() {
        System.out.println("The " + this.deviceName + " screen resolution is " + resolution + " MP");
    }
}
