package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double [] prices = {99.99, 100.01, 101.02, 102.03};

        // for each loop syntax
        // for (dataTypeOfYourArray  variableNameForEachItem  : yourArrayVariable   ) {
        //
        //    // do something with your array items

        // }

//        for (int x = 0; x < prices.length; x++) {
//
//             double eachPrice =  prices[x] ;
//            System.out.println("eachPrice = " + eachPrice);
//
//        }
        // FOR EACH LOOP CAN ONLY BE USED FOR ARRAY
        // THERE IS NO INFINITE LOOP EVER IN FOR EACH LOOP
        for (double blablabla : prices) {

            System.out.println("eachPrice = " + blablabla);

        }
    }
}
