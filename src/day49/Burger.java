package day49;

public class Burger implements Edible, Juicy {
    @Override
    public void eat() {
        System.out.println("Eating yummy burger");
    }

    @Override
    public void drink() {
        System.out.println("Drinking icy smoothie");
    }

    @Override
    public void taste() {
        System.out.println("Tasting Napa wines");
    }

    @Override
    public void melt() {
        System.out.println("My burger melted in my mouth as I was eating it!");
    }
}
