package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount =2;
        offerCount +=1;
        System.out.println("Offer count now is " + offerCount);

        ++offerCount;
        System.out.println("This is the offer count " + (offerCount+2));
    }
}
