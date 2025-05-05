package dsa;

import java.util.HashMap;

public class LongestSubArrySumZERo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -8, 6, -2, -1};
        System.out.println(sol(arr));
    }

    public static int sol (int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,0);
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(pf[i])) {
                max = Math.max(max, i - hm.get(pf[i]));
            }
            else {
                hm.put(pf[i], i);
            }
        }
        return max;
    }
}
