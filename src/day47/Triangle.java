package day47;

public class Triangle extends Shape{
    int height, base;

    public Triangle(int height, int base) {
        super("rect");

        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle area is "+this.height*this.base);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
