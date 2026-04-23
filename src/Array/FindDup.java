package Array;

import java.util.HashMap;
import java.util.Map;

public class FindDup {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = {1, 2, 3, 2, 1};
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
    }
    public static boolean findDuplicate(int[] nums) {
        return false;
    }
}
