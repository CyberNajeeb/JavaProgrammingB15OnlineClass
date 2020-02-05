package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        // please create Array of shape to store
        // 5 concrete Shape Object
        // and call the draw the method on each of them
        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them
        // Create a different class with main method:
        // and try to use the Shape, Circle, Triangle class from day 50
        // Create list of Shape and calculate their area

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        List<Shape> shapesList = Arrays.asList(s1,s2,s3);
        System.out.println("===========================");
        for (Shape each : shapesList){
            each.draw();
        }
        System.out.println("===========================");
        for (int i = 0; i < shapesList.size(); i++) {
            shapesList.get(i).draw();
        }

        Shape[] allShapes = {s1, s2, s3, new Triangle()};
        System.out.println("===========================");
        for (Shape shape : allShapes){
            shape.draw();
        }

    }

}