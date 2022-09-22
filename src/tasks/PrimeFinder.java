package tasks;

public class PrimeFinder {

    public static void primeFinder(int num){
        for (int prime = 2; prime < num; prime++){
            Boolean isPrime;
            for(int devisor = 2; devisor < prime; devisor++){
                if (prime%devisor==0){
                    isPrime=false;
                }
                break;
            }

        }
    }
}
