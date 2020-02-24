package AdHocPractice;

import java.util.*;

class ReplAssignment_179 {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("sun") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
    String uniqueCharz = "";

     for(int i = 0; i < str.length(); i++){
       if (!uniqueCharz.contains(str.charAt(i)+"")){
         uniqueCharz += str.charAt(i);
       }
//       if(str.charAt(i)!=str.charAt(i+1)){
//         uniqueCharz += "" + str.charAt(i);
      //System.out.println();
//       }
     }
    return uniqueCharz;
  }
}