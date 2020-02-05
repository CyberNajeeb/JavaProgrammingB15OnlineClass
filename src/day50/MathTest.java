package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {

    public static void main(String[] args) {

        Addition q1 = new Addition(2,2);
        System.out.println("q1 = " + q1);
        q1.calculate();
        System.out.println("q1 after calculate = " + q1);

        Subtraction q2 = new Subtraction(6,5);
        System.out.println("first q2 = " + q2);
        q2.calculate();
        System.out.println("second q2 = " + q2);

        Multiplication q3 = new Multiplication(2, 2);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 after calculation = " + q3);

        Division q4 = new Division(10, 5);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 after calculation = " + q4);

        List<Question> allTestQuestions = Arrays.asList(q1,q2,q3,q4);
        for (Question each : allTestQuestions){
            System.out.println("each = " + each);
        }
    }
}
