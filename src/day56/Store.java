package day56;

import java.util.ArrayList;
import java.util.List;
public class Store {
    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
    //List<Product> allProducts;  // store has List of products
    List<Product2> allProducts;  // store has List of products

    /**
     * A method to get most expensive Product
     *
     * @return The product object with max price
     */
    public Product2 getMostExpensiveProduct(){

//        int max = allProducts.get(0).getPrice();
        // assume my max price is lowest number in integer range so it will be replaced by any price
        int max = Integer.MIN_VALUE; //int max = allProducts.get(0).getPrice();
        int maxIndex = 0;

        Product2 maxProduct = null; // assume it's null before we actually find what we are looking for
        for (Product2 each : allProducts) {
            if (each.getPrice() > max) {
                max = each.getPrice();
                maxProduct = each;  // if max price found , assign maxProduct to the product with max price
            }

        }
        // for() above and fori() below do the same job

//        for (int x = 0; x < allProducts.size(); x++) {
//
//            if(allProducts.get(x).getPrice()>max ){
//                max = allProducts.get(x).getPrice();
//                maxIndex = x ;
//            }
//
//        }
        System.out.println("max = " + max);
        return allProducts.get(maxIndex);

    }
    public double getAveragePrice(){
        return findSumOfAllProductsPrice()/getProductCount();
    }
    public int findSumOfAllProductsPrice(){
        int sum = 0;
        for (Product2 each : allProducts){
            sum += each.getPrice();
        }
        return sum;
    }

    //    2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    //public Store(String name, List<Product> otherList) {
//        this(); // calling no arg constructor here
//        this.name = name;
//        allProducts.addAll(otherList);
//    }

    /**
     * It will check whether we have the product in the list
     *
     * @param p Product object to be checked
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product2 p) {
        return allProducts.contains(p);
    }

    /**
     * Find out 0 based location of the product in the store
     *
     * @param p product object to be checked
     * @return the index of the product in the list
     */
    public int indexOfProduct(Product2 p) {
        return allProducts.indexOf(p);
    }

    public void removeProduct(Product2 p) {

        if (checkIfProductExists(p) == true) {
            allProducts.remove(p);
        } else {
            System.out.println("We dont have " + p);
        }

    }

    /**
     * Display all products in human readable manner
     */
    public void displayProducts() {

        System.out.println(name + "'s Store has below product: ");
        for (Product2 each : allProducts) {
            System.out.println("\t each = " + each);
        }

    }

    /**
     * Counting how many products we have in the store
     *
     * @return the size of allProducts List
     */
    public int getProductCount() {

        return allProducts.size();

    }

    /**
     * This version of addProduct will directly accept ready Product object
     * so it can be added to the allProducts list
     *
     * @param p Product to be added
     */
    public void addProduct(Product2 p) {

        System.out.println("calling addProduct(Product p)");
        allProducts.add(p);

    }


    public Store() {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();
    }

    //      2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product2> otherList) {
        this(); // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
        /**
         * This version of addProduct will accept data that necessary to
         * create Product object so it can be eventually added to the list
         *
         * @param productName
         * @param productPrice
         */
//        public void addProduct (String productName,int productPrice){
//
//            Product newP = new Product(productName, productPrice);
//            allProducts.add(newP);
////        allProducts.add(  new Product(productName,productPrice )    );
//        }


    }
    /**
     * new List<Product> that contains only Products with price more than average
     *
     * @return new List<Product> that contains only Products with price more than average
     */
    public List<Product2> getAllProductsMoreThanAveragePrice() {

        List<Product2> myList = new ArrayList<>();
        double average = getAveragePrice();

        for (Product2 each : allProducts) {
            if (each.getPrice() > average) {
                myList.add(each);
            }
        }
        return myList;

    }


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}