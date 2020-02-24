package AdHocPractice;

class ReplAssignment_185 {
  public static void main(String[] args) {
    System.out.println(biggerS("abc", "abcdef"));
  }

  public static String biggerS(String a, String b) {

    int aCount = 0, bCount = 0;

    for (int i = 0; i < a.length(); i++) {
      aCount++;
    }
    for (int j = 0; j < b.length(); j++) {
      bCount++;
    }
    if (aCount > bCount) {
      return a;
    } else {
      return b;
    }
  }
}