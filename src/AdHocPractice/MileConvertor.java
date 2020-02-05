package AdHocPractice;

public class MileConvertor {

    public static void main(String[] args) {

        MileConversion mile2Km = new MileConversion();

        // Convert miles into kilometers.
        mile2Km.calculateMile(80);
        System.out.println(mile2Km.getKm());

        // Convert kilometers into miles.
        mile2Km.calculateKm(1);
        System.out.println(mile2Km.getMile());
    }

}
