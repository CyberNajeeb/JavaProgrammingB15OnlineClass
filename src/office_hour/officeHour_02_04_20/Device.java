package office_hour.officeHour_02_04_20;

public abstract class Device {

    int power;
    double screenSize, resolution;
    String deviceName, brand;
    static boolean takesPicture = true;

    public Device(int power, double size, double screenSize, double resolution) {
        this.power = power;
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public void turnOn(){
        System.out.println("Turning on my phone");
    }
    public void charge(){
        System.out.println("Charging my phone");
    }
    public abstract void screenResolution();

    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    public String getDeviseName(){
        System.out.println("Device name is "+deviceName);
        return deviceName;
    }
    public String getBrand(String brand){
        return brand;
    }

    @Override
    public String toString() {
        return "Device power is currently at = " + power +
                "%, screenSize = " + screenSize +
                " inch, resolution = " + resolution +
                "MP, device Name = '" + deviceName + '\'' +
                ", brand = '" + brand + '\'' + " takes picture " + takesPicture;
    }
}

