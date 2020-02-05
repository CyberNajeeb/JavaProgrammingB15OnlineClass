package day31;

public class Voting {
    public static void main(String[] args) {
        checkEligibility( 15);
        checkEligibility(18);
        checkEligibility(21);
    }
    public static void checkEligibility(int age ){
        //int age = 15;
        if (age > 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible");
        }
    }



}
