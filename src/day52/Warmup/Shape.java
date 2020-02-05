package day52.Warmup;

import day50.Drawable;

public abstract class Shape implements Drawable{

    String name;
    double area;

    public Shape(String name){
        this.name = name;

    }
    public abstract void calculateArea();
}
