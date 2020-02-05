package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {

        List<String> grocerries = Arrays.asList("Eggs", "Milk", "Butter," +
                "Apple", "Salmon");
        System.out.println("grocerries = " + grocerries);

        ArrayList<String> newList = new ArrayList<>(grocerries);
        newList.add("Tea");
        newList.add("Yogurt");
        System.out.println("newList = " + newList);

        List<String> newItemToAdd = Arrays.asList("Pasta", "Flour", "Cake", "KinderEggs");
        newList.addAll(newItemToAdd);
        System.out.println("newList = " + newList);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(200);

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.add(234);
        nums2.add(456);
        List<ArrayList<Integer>> nums3 =  Arrays.asList(nums1,nums2);
        System.out.println("nums3 = " + nums3);

        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("nums2 = " + nums2);


    }
}
