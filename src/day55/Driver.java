package day55;

public class Driver {
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver name = " + name + ", driver ID = " + driverID;
    }
}
