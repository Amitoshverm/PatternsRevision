package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {


        int[] arr = {-3, 4, 3, 90};
        int target = 0;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int [] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = target - nums[i];

            if (map.containsKey(sum)) {
                ans[0] = map.get(sum);
                ans[1] = i;
                return ans;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
