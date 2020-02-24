package office_hour;

public class PersonClass_1_13_20 {

    String firstName, lastName, DoB;

   public void printInfo (){
       System.out.println(String.format("First Name = %s Last Name = %s Date of Birth = %s " + firstName, lastName, DoB));
   }

    public String toString() {
        return "PersonClass_1_13_20{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DoB='" + DoB + '\'' +
                '}';
    }
}
