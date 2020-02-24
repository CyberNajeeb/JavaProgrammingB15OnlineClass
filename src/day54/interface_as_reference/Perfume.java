package day54.interface_as_reference;

public class Perfume implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("Wearing my expensive perfume");
    }
}
