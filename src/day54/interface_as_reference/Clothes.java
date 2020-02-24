package day54.interface_as_reference;

public class Clothes implements Wearable{
    int size;

    public Clothes(int size) {
        this.size = size;
    }

    @Override
    public void wear() {
        System.out.println("Wearing my new size " + size + " GAP clothes");
    }
}