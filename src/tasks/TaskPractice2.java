package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskPractice2 {
    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("QalbinurMohammad");
        nameLst.add("Ruzie");
        nameLst.add("S");
        nameLst.add("Guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyes");
        nameLst.add("MustafaMohammad");
        nameLst.add("Ayjerenjan");
        nameLst.add("Arman");
        //System.out.println("nameLst = " + nameLst);

        int charCount = 0;
        int charCount10 = 0;
        int charCount5 = 0;

        for (int i = 0; i < nameLst.size(); i++) {
            if (nameLst.get(i).length()<2){
                nameLst.remove(nameLst.get(i));
//            }else if (!(nameLst.get(i).length()>10)){
//               String longName = nameLst.get(i);
//                System.out.println("longName = " + longName);
            }else if (nameLst.get(i).length()==5){
                String longName2 = nameLst.get(i);
                System.out.println(longName2);
            }

        }
        /**
         Given List of names with various character count,
         Remove any name with less than 2 characters
         and if any name has more than 10 character only keep 10 characters
         and if it has exactly 5 characters , reverse it
         Of course , Otionally make a method out of it.
         */


    }
}
