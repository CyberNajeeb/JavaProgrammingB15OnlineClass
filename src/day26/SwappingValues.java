package day26;

public class SwappingValues {

    public static void main(String[] args) {

        String name1 = "Emma";
        String name2 = "Jason";

        String tempName = name1;

        name1 = name2;

        System.out.println("name1 = " + name1);

        name2 = tempName;
        System.out.println("name2 = " + name2);


    }
}
