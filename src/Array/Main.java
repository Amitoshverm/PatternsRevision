package Array;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 1};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int ans = 0;

        for (Integer val : map.values()) {
            if (val > 1) {
                ans++;
            }
        }
        return ans;
    }
}
