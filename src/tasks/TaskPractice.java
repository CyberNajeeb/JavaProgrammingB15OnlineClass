package tasks;
import java.util.*;
public class TaskPractice {
    public static void main(String[] args) {

       ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 3, 7, 2, 12, 7));
        System.out.println("arrList = " + arrList);

        for (int i = 1; i < arrList.size(); i+=2) {
            arrList.add(i,100);

        }System.out.println("arrList = " + arrList);
        lst(100);
        /**
         Given a ArrayList of 6 Integer 1,3,7,2,12,7
         insert 100 in between each numbers
         For example :
         1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
         Optionally make it a method
         write a static void method that accept a ArrayList of integer
         object and insert 100 in between items.
         */
    }

  public static List<Integer> lst (Integer lst2) {
      ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 3, 7, 2, 12, 7));
      for (int i = 1; i < arrList.size(); i+=2) {
          arrList.add(i,lst2);

      }System.out.println("arrList = " + arrList);
        return arrList;
    }
}
