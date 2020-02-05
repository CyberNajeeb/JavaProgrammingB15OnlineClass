package day50;

public abstract class Shape implements Drawable{

    String name;
    double area;

    public Shape(String name){
        this.name = name;

    }
    public abstract void calculateArea();
}
