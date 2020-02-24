package day34;

public class MoreMethodPractice {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble2(true,false));
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
    }

    /**
     * A method that return true only if both monkeys are smiling or not smiling
     *
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return aSmile == bSmile;
    }

    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {

        if ((aSmile&&bSmile)|| (!aSmile&&bSmile)){
            return "yes";
        }else {
            return "no";
        }

    }
}