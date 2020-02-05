package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListObjectEqualityCheck {
    public static void main(String[] args) {

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(200,300,600,700,800));

        System.out.println("nums1.equals(nums2 = " + nums1.equals(nums2));
        System.out.println("nums2.equals(nums3 = " + nums2.equals(nums3));

        // To check if the two lists are equal, both list' elements must
        // be in the same order.

    }
}
