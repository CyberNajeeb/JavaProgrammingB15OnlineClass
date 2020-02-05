package day43;

import java.util.Scanner;

public class Pet {

    private String name = "Unknown", breed = "Unknown", color;
    private boolean speaks;
    private int age;

    public Pet() {
        this.name = name;
        this.breed = breed;
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Pet(String name) {

    }

    public Pet(int age) {

    }

    public void setName(String name) {

    }

    public void setBreed(String breed) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your pet's name? ");
        this.breed  = sc.next();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public void isSpeaks() {
        switch (breed) {
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "cow":
                System.out.println("moo");
                break;
            case "horse":
                System.out.println("neinei");
                break;
            default:
                break;
        }
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", speaks=" + speaks +
                ", age=" + age +
                '}';
    }
}
