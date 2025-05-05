package dsa;

import java.util.HashMap;

public class MinDupDistance {
    public static void main(String[] args) {
        System.out.println(sol(new int[]{1,2,3,6,1,2,3,2,1}));
    }

    public static int sol(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n-1; j++) {
//                if (arr[i] == arr[j]) {
//                    ans = Math.min(ans, j - i);
//                }
//            }
//        }

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                ans = Math.min(ans, i - hm.get(arr[i]));
                hm.put(arr[i], i);
            }
            else {
                hm.put(arr[i], i);
            }

        }
        return ans;
    }
}
