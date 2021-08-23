package AdHocPractice;

public class Repl55 {

    public static String censorLetter(String s, char ch) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.replace(ch, '*');
        }
        return result;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e')); //"comput*r sci*nc*"
        System.out.println(censorLetter("trick or treat", 't')); //"*rick or *rea*"
    }
}
