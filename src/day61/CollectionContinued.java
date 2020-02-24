package day61;

import java.util.*;

public class CollectionContinued {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.addAll(Arrays.asList(2,3,4,5,6,7));
        System.out.println("nums = " + nums);
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9,87,6,4,3,2));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

    }
}
