package day52.Polymorphism;

public abstract class Shape implements Drawable {

    String name;
    double area;
    int radius;

    public Shape(String name){
        this.name = name;
        this.radius = radius;

    }

    public Shape(String book, int i, int i1) {

    }

    public abstract void calculateArea();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", radius=" + radius +
                '}';
    }
}
