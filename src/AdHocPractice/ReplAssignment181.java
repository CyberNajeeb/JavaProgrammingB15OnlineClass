package AdHocPractice;

class ReplAssignment181 {
  public static void main(String[] args) {
    System.out.println(wordCount("abc def"));
  }

  public static int wordCount(String words) {

    int wordCount = 1;
    for (int i = 0; i < words.length(); i++) {
      if (words.charAt(i)==' '){
        wordCount++;
      }
    }
    return wordCount;

    //below code also works

    //return words.split(" ").length;
  }

}