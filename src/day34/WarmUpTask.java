package day34;

public class WarmUpTask {
    public static void main(String[] args) {
        System.out.println(build3DigitNumber(14,15,16));
        System.out.println(build3DigitNumber(6,4,0));
    }
    public static int build3DigitNumber(int digit1, int digit2, int digit3){

        //int number = digit1 *100 + digit2 *10 + digit3 ;

        if (digit1>9||digit1<0){
            digit1 = 0;
        }
        if (digit2>9||digit2<0){
            digit2 = 0;
        }
        if (digit3>9||digit3<0){
            digit3 = 0;
        }

        return 0;
    }
}
