package tasks;

public class CharCount {
    static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (("" + str.charAt(i)).equals("x") && ("" + str.charAt(i + 1)).equals("x")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countXX("abcxgxx"));
    }

}
