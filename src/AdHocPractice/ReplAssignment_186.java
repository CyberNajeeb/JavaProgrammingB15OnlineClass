package AdHocPractice;

class ReplAssignment_186 {
  public static void main(String[] args) {
    System.out.println(removeFirst("abc"));
  }
  public static String removeFirst(String target) {
      target = target.replace(target.substring(0, 1), "");
      String result = target.replace(target.substring(target.length() - 1), "");

      return target + " and " + result;
  }
}