package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {
        System.out.println(divide(10,2.5));
        System.out.println(divide(10,2.5));
    }
    public static double divide (double num1, double num2){

        if (num2==0){
            return 0;
        }else {
            return num1 / num2;
        }

    }
}
