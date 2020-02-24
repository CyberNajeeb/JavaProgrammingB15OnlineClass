package office_hour.officHour_02_19_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>(Arrays.asList(2,4,1,5,6,23,7));
        Iterator<Integer> numIterator = lst.iterator();

        System.out.println("numIterator = " + numIterator.hasNext() + ". " +
                "Checks if we have element in next position.");
        System.out.println("numIterator = " + numIterator.next() + ". " +
                "Will move the cursor to the next element to get the value.");
    }
}
