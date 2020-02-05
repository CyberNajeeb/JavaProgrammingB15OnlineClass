package day50;

public abstract class Question {
    public Question() {
    }

    int num1, num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "unknown";

    public abstract void calculate();

    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "This question is " + questionType ;
    }
}
