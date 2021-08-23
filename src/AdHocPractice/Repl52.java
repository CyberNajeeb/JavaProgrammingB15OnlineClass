package AdHocPractice;

public class Repl52 {
    public static String alphabetical(String str) {
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > str.charAt(j))
                    result += "" + str.charAt(i);
            }
        }
        return result;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(alphabetical("adatplqzh")); //"adtz"
    }
}
