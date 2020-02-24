package Day41;

public class TVStore {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.brand = "LG";
        tv1.name = "65\" OLED";

        tv1.turnOn();
        tv1.setCurrentChannel(121);
        System.out.println(tv1.getCurrentChannel());
        System.out.println("tv1.toString() = " + tv1.toString());

        tv1.turnOff();


        }
}
