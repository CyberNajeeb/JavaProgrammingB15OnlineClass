package day20;

public class PalendromeTest {
    public static void main(String[] args) {

        String name = "Abdul";
        System.out.println("name = " + name);

        String reversedName = "";
        for (int x = name.length()-1; x>= 0; x--){
            reversedName += name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome Test Passed");

        }else {
            System.out.println("Palindrome Test Failed");
        }
    }
}
