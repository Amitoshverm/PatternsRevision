package Array;

import java.util.*;

public class MultipleExceptItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // int curr = nums[i];
            int m = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                m = m * nums[j];
            }
            ans[i] = m;
        }
        return ans;
    }
}
