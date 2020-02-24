package AdHocPractice;

class ReplAssignment183 {
  public static void main(String[] args) {
    System.out.println(limit("abc", 2));
  }
  public static String limit(String text, int maxLength)
  {
    return text.substring(0,maxLength);
  }
}