package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RoughNew {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {2, 1, 6, 5, 9};
        System.out.println(Arrays.toString(twoSum2(nums2, 14)));
    }

    // when array is sorted
    public static int [] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        int n = nums.length;
        int l = 0, r = n - 1;
        while( l < r) {
            if (nums[l] + nums[r] == target) {
                res[0] = l;
                res[1] = r;
                return res;
            }
            else if (nums[l] + nums[r] < target) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;

    }

    // when array is unsorted
    public static int[]  twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n =  nums.length;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;

        for (int i = 0; i < n; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum)) {
                res[0] = sum;
                res[1] = nums[i];
            }
            map.put(nums[i], i);
        }
        return res;

    }
}

// [2,7,11,15] target = 9-> [2, 7]
// [2, 1, 6, 5, 9] target = 19, -> [1, 9]