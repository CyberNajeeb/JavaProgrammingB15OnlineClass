package day30;

public class ArrayReview {
    public static void main(String[] args) {

        String carInventory[] = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",};

        int chevyCount = 0;
        int civicCount = 0;
        for (String eachCar : carInventory){
            if (eachCar.contains("Chevrolet")) {


                chevyCount++;

            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                civicCount++;
            }

        }
        System.out.println("civicCount = " + civicCount);
        System.out.println("chevyCount = "+chevyCount);
        }
    }

