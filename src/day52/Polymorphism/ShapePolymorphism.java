package day52.Polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {
        Shape s1 = new Circle("penny", 5);
        printAnyShapeArea(s1);
        Shape s2 = new Rectangle("BCD");
        drawShape3Times(s1);

//        Circle  s1 = new Circle("penny",5);
//        Shape  s1 = new Circle("penny",5);

//        Drawable s1 = new Circle("penny",5);

        // ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE
//        s1.draw();
//        s1.draw();

        System.out.println(s1.toString());

        // How do I know what is the actual object type
        System.out.println(s1.getClass().getSimpleName());


    }

    public static void printAnyShapeArea(Shape anyShape) {
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is " + anyShape.area);
    }

    public static void drawShape3Times(Shape threeTimesShape) {
        for (int i = 1; i < 4; i++) {
            threeTimesShape.draw();System.out.println("threeTimesShape = " + threeTimesShape);
        }

    }
}