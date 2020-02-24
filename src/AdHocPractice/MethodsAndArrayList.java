package AdHocPractice;

import java.util.List;

public class MethodsAndArrayList {

    String firstName, lastName;

    public static void printMethodsAndArrayList(List<MethodsAndArrayList> myM) {
        System.out.println(myM.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void printMethodsAndArrayList(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "MethodsAndArrayList{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
