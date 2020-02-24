package day54.interface_as_reference;

public class Makeups implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("Wearing my expensive makeup");

    }
}
