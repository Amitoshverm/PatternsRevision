package Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 2, 1, 1};
//        System.out.println(numIdenticalPairs(arr));
        int[] arr = {2, 2, 2, 2};
        System.out.println(fourSum(arr, 8));


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

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            for (int j = i + 1; j < n; j++) {
                int second = nums[j];
                // if (j != 0 && nums[j-1] == nums[j]) {
                //     continue;
                // }
                int l = j + 1;
                int r = n - 1;
                while (l < r) {
                    int sum = first + second + nums[l] + nums[r];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(first);
                        list.add(second);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                        l++;
                        r--;
                        // while (l < r && nums[l-1] == nums[l]) {
                        //     l++;
                        // }
                        // while (l < r && nums[r+1] == nums[r]) {
                        //     r--;
                        // }
                    }
                    else if (sum > 0) {
                        r--;
                    }
                    else {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }

        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }
        return !map.isEmpty();
    }
}
