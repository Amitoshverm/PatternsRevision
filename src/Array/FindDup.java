package Array;

import java.util.HashMap;
import java.util.Map;

public class FindDup {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = {1, 2, 3};
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        System.out.println(map);
        System.out.println(findDuplicate(nums));
    }
    public static boolean findDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
