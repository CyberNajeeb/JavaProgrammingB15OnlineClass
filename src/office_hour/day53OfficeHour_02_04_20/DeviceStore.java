package office_hour.day53OfficeHour_02_04_20;

public class DeviceStore {
    public static void main(String[] args) {

        Device d1 = new iPhone(98,6.5,5.8,12);
        d1.brand = "iPhone";
        d1.deviceName = "11 Pro Max";
        d1.screenResolution();
        d1.turnOn();

        System.out.println("d1 = " + d1);

    }
}
