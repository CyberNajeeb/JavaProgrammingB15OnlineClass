package day46;

public class JavaProgrammer extends Programmer {
    public JavaProgrammer() {
    }

    @Override
    public void code(){
        System.out.println("Java Programmer codes the best!");
        //super.code();
    }
    @Override
    public void test(){
        System.out.println("Java Programmer tests");
    }

    public static void main(String[] args) {
        JavaProgrammer j1 = new JavaProgrammer();

        j1.code();
        j1.test();
    }
}
