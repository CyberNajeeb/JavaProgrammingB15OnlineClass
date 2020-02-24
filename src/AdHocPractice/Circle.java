package AdHocPractice;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle){
            return radius == ((Circle) obj).radius;
        }
            return false;
    }
}
