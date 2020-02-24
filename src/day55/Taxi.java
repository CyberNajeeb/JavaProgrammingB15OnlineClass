package day55;

public class Taxi {

    private int plateNumber;
    private Engine engine;

    Driver d1;
    public Taxi(int plateNumber, Engine engine, Driver d1) {
        this.plateNumber = plateNumber;
        this.engine = engine;
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return "Taxi plate Number = " + plateNumber +
                ", " + engine +
                ", driver = " + d1;
    }
}
class Engine{
String type;
int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine type = " + type +
                ", horsePower = " + horsePower;
    }

}

