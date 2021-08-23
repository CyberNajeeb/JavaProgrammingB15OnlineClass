package AdHocPractice;

public class Repl57 {

    public static String surroundStr(String s, String searchTerm) {
        String result = "";
        for (int i = 0; i < s.length() - searchTerm.length() + 1; i++) {
            if (s.substring(i, i + searchTerm.length()).equals(searchTerm))
                result += "(" + searchTerm + ")";
        }
        return result;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(surroundStr("abcabcabc", "abc")); //"(abc)(abc)(abc)"
        System.out.println(surroundStr("there, on planeth hoth", "th")); //"(th)ere, on plane(th) ho(th)"
    }
}

