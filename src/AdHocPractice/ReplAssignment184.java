package AdHocPractice;

class ReplAssignment184 {
  public static void main(String[] args) {
    System.out.println(at3("abcghi", "d"));
  }
  public static String at3(String target,String word)
  {
    return target.substring(0,3)+word + target.substring(3);
  }
}