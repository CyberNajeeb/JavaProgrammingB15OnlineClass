package officeHours;

public class Day25_12_10 {

    public static void main(String[] args) {
        String fruits[] = {"Apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        for (int i = fruits.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                continue;
            }
            String str = fruits[i];
            System.out.print(str + " ");
            if (str.endsWith("berry")) {
                System.out.println(str);
            }

        }
        System.out.println("=============================");

        for (String eachFruit : fruits) {
            char lastChar = eachFruit.charAt(eachFruit.length() - 1);
            if (lastChar == 'y') {
                System.out.print(eachFruit + " ");
            }
        }

        //Task 1.8
        for (int i = 0; i < fruits.length; i++) {
            String lastThreeChars = fruits[i].substring(fruits[i].length() - 3, fruits[i].length());
            System.out.println(lastThreeChars);
        }
        System.out.println("=============================");

        for (String eachFruit : fruits) {
            String last3 = "" + eachFruit.charAt(eachFruit.length() - 3) + eachFruit.charAt(2) + eachFruit.charAt(1);
            System.out.println(last3);
        }
        System.out.println("=============================");
        //INdex                 0      1      2      3       4     5
        float[] itemPrices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float max = itemPrices[0];
        for (float eachPrice : itemPrices) {
            if (eachPrice > max) {
                max = eachPrice;

            }
        }
        System.out.println(max);

        System.out.println("=============================");
        float max2 = itemPrices[0];
        for (float eachPrice : itemPrices) {
            if (eachPrice < max2) {
                continue;
            }
            max2 = eachPrice;

        }
        System.out.println(max2);
        System.out.println("=============================");

        //finding the second max number from array

        float secondMax = itemPrices[0];
        for (float eachPrice : itemPrices) {

            if (eachPrice > secondMax && eachPrice < 4.65) {
                secondMax = eachPrice;
                System.out.println(secondMax);
            }
        }
        System.out.println("=============================");
        // find the index number of second max number

        for (int i = 0; i < itemPrices.length; i++) {
            if (itemPrices[i] == secondMax) {
                System.out.println("Index number of second max number, " + secondMax + ", is " + i);
            }
        }
        System.out.println("=============================");
        // find the index number of first max number

        for (int i = 0; i < itemPrices.length; i++) {
            if (itemPrices[i] == max) {
                System.out.println("Index number of first max number, " + max + ", is " + i);
            }


        }
    }
}