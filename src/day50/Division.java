package day50;

public class Division extends Question {

    public Division(int num1, int num2) {
        super("/", "Division question");

//        if (num2==0) {
//            int temp = num1;
//            num1 = num2;
//            num2 = temp;
//        }
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate() {
        if (num2 == 0) {
            answer = 0;
        } else {
            answer = num1 / num2;
            calculated = true;
        }
    }
    @Override
    public String toString() {

        if (calculated) {
            return num1 + operator + num2 + " = " + answer;
        } else {
            return num1 + operator + num2 + " = ";
        }
    }
}
