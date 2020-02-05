    package day21;

    public class SkipAll5s {

        public static void main(String[] args) {

           // int num = 0;

            for (int x =1; x<= 20; x++){
                if (x%5==0){
                    System.out.println("Skipping " + x);
                    continue;
                }System.out.println(x);
            }

        }
    }
