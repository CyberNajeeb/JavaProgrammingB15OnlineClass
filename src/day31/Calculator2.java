package day31;

public class Calculator2 {
    public static void main(String[] args) {

        calculate(10,30,'-');
        calculate(20,10,'+');
        calculate(40,3,'*');
        calculate(40,4,'/');
        calculate(40,4,'A');

        char operator = '+' ;
        int num1 = 15, num2 = 3;
        switch (operator){
            case '+':
                System.out.println("Addition result is " + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is " + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is " + (num1*num2));
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    public static void calculate(int num1, int num2, char operator ){

    }
}
