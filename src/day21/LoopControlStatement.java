package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            //System.out.println(i);
            break;

        }

        for (int i = 1; i <= 10; i++) {

            //System.out.println(i);
            if (i==5){
                break;
            }

        }
        int sum = 0;

        for (int i = 1; i <=10; i++) {
            System.out.println("Current sum is: " + sum);
            System.out.println("If I add " + i + " dollar, the sum would be " + sum + i);
            sum = sum + i;

            if (sum > 40) {
                System.out.println("final sum is " + sum);
                break;
            }else {

            }
        }
            //System.out.println(" sum " + sum);

        }
    }
