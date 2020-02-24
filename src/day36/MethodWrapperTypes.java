package day36;

public class MethodWrapperTypes {
    public static void main(String[] args) {

        // Ways to call the method that accepts Onteger objects as its value:

      Integer i1 = 12;
        Integer i2 = 12;
      sumAndPrint(i1,i2);

      //   OR

      sumAndPrint(12, 12);

        //   OR

        sumAndPrint(Integer.valueOf(12), Integer.valueOf(12));
    }

    /**
     * This method adds two Integer numbers and print
     * @param num1 type Integer, first number to add
     * @param num2
     */
    public static void sumAndPrint(Integer num1, Integer num2){

        System.out.println(num1 + num2);
    }
}
