package AdHocPractice;

class ReplAssignment_182 {
  public static void main(String[] args) {
    System.out.println(clean("abc def ghi", "ghi"));
  }
  public static String clean (String text ,String badWord) {

      return text.replace(badWord, "");
  }
}