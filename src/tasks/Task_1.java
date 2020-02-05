package tasks;

public class Task_1 {

    public static void main(String[] args) {
        String[] groceryItems = new String[]{"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] itemPrices = {1.99f, 0.99f, 4, 65f, 3.89f, 3.88f, 2.88f};

        // loop through each grocery items and print them in one line
        for (int a = 0; a <=groceryItems.length-1; a++) {
            System.out.print(groceryItems[a] + " ");
    }


            // print each items at odd index
        for (int b = 0; b <=groceryItems.length-1; b++) {
            if (b%2==0){
                continue;
            }
            System.out.println(groceryItems[b]);
        }
        // print all items in reverse order
        for (int c = groceryItems.length-1; c>=0; c--) {
            System.out.print(groceryItems[c] + " ");
        }
        // find out the index location of strawberry
        int indexOfItems = groceryItems.length-1;
        System.out.println(groceryItems[indexOfItems]);
    }
}