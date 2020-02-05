package day53;

import java.util.*;

public class FruitShop {
    public static void main(String[] args) {

        Apple a1 = new Apple("Sweet", "Red", "Fuji");
        System.out.println("taste = " + a1.taste);
        System.out.println("color = " + a1.color);
        System.out.println("type = " + a1.type);
        a1.getDigested();

        System.out.println("========================================");

        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigested();

        Fruit f2 = new Apple("Crispy", "red hot", "Gala");
        Fruit f3 = new Orange("Sour", "orange", 10);
        Fruit f4 = new Orange("Very sweet", "Blood red", 12);

        System.out.println("000000000000000000000000000000000");
        Fruit[] fruits1 = {f1, f2, f3, f4};
        for (Fruit eachFruit : fruits1){
            eachFruit.getDigested();
        }
        System.out.println("-----------------------------------");
        //The below list is not resizable, addable, or removable.
        // List<Fruit> fruits = Arrays.asList(f1,f2,f3,f4);
        //Use below List instead, to be able to make edits and modifications.
        List<Fruit> fruits = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));
        for (Fruit eachFruit : fruits){
            eachFruit.getDigested();
        }
        System.out.println(fruits.getClass().getSimpleName());
    }
}
