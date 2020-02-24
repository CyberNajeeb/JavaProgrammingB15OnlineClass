package day34;

public class ReturnPractice {
    public static void main(String[] args) {

        //What is return keyword used in/on
        //it can be used to get out of the method
        //also can be used with a void method

        //break vs. return
        //break --> loop : brek put of the case
        // switch --> break out of the case
        prontMin4CharacterLengthName("Jon");
        prontMin4CharacterLengthName("Java Shark");
    }
    public static void prontMin4CharacterLengthName(String name){
        if (name.length()<4){
            System.out.println("Invalid Name");
            //return;
        }
        System.out.println(name);
    }
}
