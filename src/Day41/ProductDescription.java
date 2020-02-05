package Day41;

public class ProductDescription {

    public static void main(String[] args) {


        Product lgTV = new Product();

        lgTV.setName("LG OLED TV");
        System.out.println(lgTV.getName());

        lgTV.setPrice(2999.99);

        System.out.println(lgTV.getPrice());
    }
}
