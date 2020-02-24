package day54;

public abstract class Animal implements IndoorPet{
    String name;

    public abstract void speak();
}
class Dog extends Animal implements IndoorPet{

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("Bark!!");
    }
    @Override
    public void play() {
        System.out.println("Fetching...");
    }
}
