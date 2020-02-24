package day42;

public class Computer {
    private String brand;
    private byte ramSize;
    private double price;

    public void runProgram(){
        System.out.println(brand + " brand is running program with the ram " + ramSize);
    }
    public void calculate(){
        System.out.println(brand + " is calculating...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte getRamSize() {

        return ramSize;
    }

    public void setRamSize(byte ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 20) {
            this.price = price;
        }
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ramSize=" + ramSize +
                ", price=" + price +
                '}';
    }
}

