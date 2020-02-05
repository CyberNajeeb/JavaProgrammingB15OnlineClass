package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        System.out.println("myDog = " + myPet);
        myPet.isSpeaks();
        myPet.setName("Cow");
        myPet.isSpeaks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your pet's name? ");


        Pet p1 = new Pet("horse","Walter");
        Pet p2 = new Pet("cat","Samantha");
        Pet p3 = new Pet("dog","Oliver");
        Pet p4 = new Pet("dog","Henry");
        Pet p5 = new Pet("cow","Adam");
        Pet p6 = new Pet("ant","Atom");
        Pet p7 = new Pet("bear","Teddy");
        Pet p8 = new Pet("cat","Stephanie");

        List<Pet> myPetList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
        System.out.println("my Pet list = " + myPetList);
        System.out.println("my Pet name = " + p1.getName());
        System.out.println("my Pet breed = " + p1.getBreed());
    }
}
