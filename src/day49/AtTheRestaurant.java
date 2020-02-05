package day49;

public class AtTheRestaurant {
    public static void main(String[] args) {

        Burger burger = new Burger();
        burger.eat();
        burger.melt();
        burger.drink();
        burger.taste();
        burger.digest();


        System.out.println("+++++++++++++++");

        IceCream iceCream = new IceCream();
        iceCream.eat();
        iceCream.drink();
        iceCream.taste();
    }
    //@Override
    public void digest(){
        System.out.println("true");
    }
}
