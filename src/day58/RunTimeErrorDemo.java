package day58;

public class RunTimeErrorDemo {
    static int num = 0;

    public static void main(String[] args) throws Exception {
//        try {
            num++;

            System.out.println("num = " + num);
            //main(null);
//            } catch (StackOverflowError | RuntimeException e) {
            System.out.println("e = e" );
//            }
//            try {
            System.out.println("true = " + true);
//          System.out.println(" division by 0 " + 1/0);
            Thread.sleep(3000);

            System.out.println("false = " + false);
//            }
//            catch (InterruptedException e){
//            System.out.println("Gotcha!!");
//            }
        }
    }
