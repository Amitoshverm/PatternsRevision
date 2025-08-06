//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr));
    }
    public static int search(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + (r-l)/2;
            if (arr[mid] > arr[r]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        return arr[l];
    }
}