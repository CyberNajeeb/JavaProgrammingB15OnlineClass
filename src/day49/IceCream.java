package day49;

public class IceCream extends Object implements Edible {
                    // this is to make the point that the
                    //class extends Object in the background
    @Override
    public void eat() {
        System.out.println("Eating yummy ice cream");
    }

    @Override
    public void drink() {
        System.out.println("drinking my melted ice cream");
    }

    @Override
    public void taste() {
        System.out.println("Tasting a new ice cream");
    }
}
