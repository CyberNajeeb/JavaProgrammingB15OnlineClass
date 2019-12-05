package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        int num = 1;
        while (num<=100){

        if (num%5==0 && num%3==0) {
            System.out.println(num + " is Fizz Buzz number");
        }else if (num%5==0) {
            System.out.println(num + " is Fizz number");
        }else if (num%3==0) {
            System.out.println(num + " is Buzz number");
//        }else {
//            System.out.println(num + " unknown");
        }            ++num;


//        int num = 1;
//            while (num<=100){
//                System.out.println(num);
//
        }
    }

}