package Array;

public class NonRepeat {
    public static void main (String[] args) {
        int[] one = {5, 3, 2, 2, 1, 5, 5, 7, 5, 10};
        int[] two = {10, 111, 1, 9, 5, 67, 2};
        printRepeatEle(two, one);
    }

    public static void printRepeatEle(int[] arr, int[] arrr) {
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arrr.length; j++) {
                if (arrr[j] == arr[i]) {
                    c++;
                }
            }
            System.out.println(arr[i]+" frequency is : " + c);
        }
    }
}
// l
// r
// 1, 2, 3, 4, 5, 5, 6, 7, 8,7