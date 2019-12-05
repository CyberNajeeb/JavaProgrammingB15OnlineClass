package day13;

import java.util.Scanner;

public class AmazonShippingCalculator_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me about yourself. Do you shop?");
        boolean wantToShop = sc.nextBoolean();
        String preference = sc.nextLine();

        if (wantToShop) {
            System.out.println("Where do you want to shop, in-store or online?");
        }preference = sc.nextLine();

            if (preference.equalsIgnoreCase("store")) {
            }
            System.out.println("You need an umbrella");
        {
        }if (preference.equalsIgnoreCase("online")) {
                System.out.println("You need internet connection");
            }
        //}else {
            System.out.println("Great decision. Happy coding!");
        }
        }


