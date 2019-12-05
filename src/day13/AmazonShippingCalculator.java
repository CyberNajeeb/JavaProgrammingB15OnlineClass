package day13;

public class AmazonShippingCalculator {

    public static void main(String[] args) {
        String memberType = "Prime Member ";
        double amount = 15.99D;
        int shippingFee = 25;
        double shoppingAmount = 0;

        if (memberType.equalsIgnoreCase("Prime Member")) {
            System.out.println("Your shipping fee is $0  You also get One-Day Shipping!");
        } else if (!memberType.equalsIgnoreCase("Prime Member") && shoppingAmount >= 35) {
            System.out.println("Your shopping amount is over $25, which qualifies you for free shipping");

        } else if (memberType.equalsIgnoreCase("Prime Member") && shoppingAmount < 35) {
        System.out.println("As a non-Prime member, you have to pay " + shippingFee);
    }else {
            System.out.println("PLease create an Amazon account");

        }
        }
    }

