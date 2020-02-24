package AdHocPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsAction {
    public static void main(String[] args) {

        MethodsAndArrayList myMethod = new MethodsAndArrayList();

        myMethod.setFirstName("Najeeb");
        myMethod.setLastName("Sohrabi");

        MethodsAndArrayList yourMethod = new MethodsAndArrayList();

        yourMethod.setFirstName("Arman");
        yourMethod.setLastName("Sohrabi");

        List<MethodsAndArrayList> myM = new ArrayList<>();

        myM.add(myMethod);
        myM.add(yourMethod);

        MethodsAndArrayList.printMethodsAndArrayList(myM);
        //myMethod.setFirstName("Daria");
        System.out.println(myMethod.getFirstName());
        System.out.println(yourMethod.getFirstName());
    }

}
