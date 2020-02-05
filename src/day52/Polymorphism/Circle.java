package day52.Polymorphism;

public class Circle extends Shape implements Drawable {


    public Circle(String name, int radius) {
        super("abc");
        this.radius = radius;

    }

    @Override
    public void draw() {

    }

    @Override
    public void calculateArea() {
        System.out.println();
    }
}
