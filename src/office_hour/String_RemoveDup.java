package office_hour;

public class String_RemoveDup {
    public static void main(String[] args) {

        System.out.println(result("ABCDABCDABCD"));
        System.out.println(result1("Najeeb Sohrabi", 'S'));
        charAndCount("ABCDABCDABCD");
    }

    public static String result(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains(str.substring(i, i + 1)))) {

                result += str.substring(i, i + 1);
            }
        }

        return result;
    }

    public static int result1(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch) {
                count++;
            }
        }
        return count;
    }
    public static void charAndCount(String str){

       String nonDup = result(str);

        for (int i = 0; i < nonDup.length() ; i++) {
            int counter = result1(str, nonDup.charAt(i));
            System.out.print(nonDup.charAt(i) + "" + counter);
        }

    }
}
