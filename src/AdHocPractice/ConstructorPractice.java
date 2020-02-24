package AdHocPractice;

public class ConstructorPractice {

    public ConstructorPractice() {
        this(1);
        System.out.println("true = " + true );
    }
    public ConstructorPractice(int x) {
        System.out.println("true = " + true + x);
        //this(100);
    }
    static class Action{
        public static void main(String[] args) {
            ConstructorPractice c1 = new ConstructorPractice();
        }
    }
}
