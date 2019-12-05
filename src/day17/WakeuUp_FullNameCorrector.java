package day17;

public class WakeuUp_FullNameCorrector {
    public static void main(String[] args) {
        //                 01234567890123
        String fullName = "naJeEb SOhrAbI";

        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7);

        String nameCorrected =
                firstName.toUpperCase().substring(0,1)
                + firstName.toLowerCase().substring(1);
        System.out.println("nameCorrected = " + nameCorrected);
    }
}
