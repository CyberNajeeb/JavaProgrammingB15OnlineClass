package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
        giveMeMyName();
        String name = giveMeMyName();
        System.out.println("name = " + name);
        System.out.println(addTwoNumber(14,16));
    }
    public static String giveMeMyName (){
        return "Najeeb";
    }
    public static int addTwoNumber(int num1, int num2){

        return num1 + num2;
    }
}
