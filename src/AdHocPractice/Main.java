package AdHocPractice;

import java.util.Arrays;
import java.util.List;

class Main {

  public static String lameDb(String db, String op,String id,String data)
  {
      List<String> dbb = Arrays.asList(db.split("#"));
      if (op.equals("add")){
          db += data;
      }else if (op.equals("edit")){
          dbb.set(1,id+data);
      }else if (op.equals("delete")&&id.equals("1")){
          dbb.set(0,"");
      }

      for (int i = 0; i < db.length(); i++) {

      }

    return "";
  }//end lameDb
  
   public static void main(String[] args) 
   {

     System.out.print(
       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
       
      System.out.print(
       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
       
      System.out.print(
       lameDb("1tst#2bla#3foo","delete","1","")+"\n");
       
        System.out.print(lameDb("1tst#2bla#3foo","none","1","")+"\n");
     
   }
  
}