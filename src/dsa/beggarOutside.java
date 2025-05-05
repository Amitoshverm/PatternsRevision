package dsa;

import java.util.Arrays;

public class beggarOutside {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {4,2}, {2,1}, {1,-1}};
        int[] arrr = {0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(sol(arr, arrr)));
    }

    public static int[] sol(int[][] arr, int[] beggar) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = arr[i][0];
            int money_to_give = arr[i][1];

            beggar[index] += money_to_give;
        }

        int[] pf = new int[beggar.length];
        pf[0] = beggar[0];

        for (int i = 1; i < beggar.length; i++) {
            pf[i] = pf[i-1] + beggar[i];
        }
        return pf;
    }
}
