package day52.Polymorphism;

public class Rectangle extends Shape {

    int width, height;

    public Rectangle(String name) {
        super(name);
        this.height = height;
        this.width = width;
    }

    public Rectangle(String book, int i, int i1) {
        super(book, i, i1);
    }

    @Override
    public void calculateArea() {
        area = width * height;
        System.out.println(area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
