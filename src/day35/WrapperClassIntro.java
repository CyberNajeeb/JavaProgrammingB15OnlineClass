package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10;
        Integer xObj1 = new Integer( 10);
        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        System.out.println("xObj3 = " + xObj3);
        System.out.println("xObj2 = " + xObj2);
        System.out.println("xObj1 = " + xObj1);
    }
}
