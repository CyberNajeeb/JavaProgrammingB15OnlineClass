package day42;

public class CompSpecs {

    public static void main(String[] args) {

        Computer myPC = new Computer();

        myPC.setBrand("Apple");
        myPC.setRamSize((byte) 20);
        myPC.setPrice(1299);

        myPC.runProgram();
        myPC.calculate();
        System.out.println(myPC.getRamSize());

        System.out.println("myPC.toString() = " + myPC.toString());
    }
}
