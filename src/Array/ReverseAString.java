package Array;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7};
        int res[] = {1, 2, 3, 4, 5, 6};
        String str = "hello";
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse(res, 3, 5);
        System.out.println(Arrays.toString(res));
        String newres = reverse(str);
        System.out.println(newres);


    }

    public static void reverse(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
