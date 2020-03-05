package office_hour.officeHour_02_25_20;

public class StringBuilder_BufferPractice {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("java");
        System.out.println("str1 = " + str1);

        StringBuilder str2 = new StringBuilder("Java");
        System.out.println("str2 = " + str2);

        System.out.println(str1.compareTo(str2));
        System.out.println("str1.reverse() = " + str1.reverse());
    }
}
