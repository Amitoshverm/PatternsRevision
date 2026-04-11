package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4}; // {-4, -1, -1, 0, 1, 2}
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int first = nums[i];

            int a = i + 1;
            int b = n - 1;

            while (a < b) {
                int sum = first + nums[a] + nums[b];
                if (sum == 0) {

                    List<Integer> list = new ArrayList<>();
                    list.add(first);
                    list.add(nums[a]);
                    list.add(nums[b]);
                    ans.add(list);
                    a++;
                    b--;
                    while (a < b && nums[a] == nums[a - 1]) {
                        a++;
                    }
                    while (a < b && nums[b] == nums[b + 1]) {
                        b--;
                    }

                } else if (sum > 0) {
                    b--;
                } else {
                    a++;
                }
            }
        }
        return ans;
    }

}
