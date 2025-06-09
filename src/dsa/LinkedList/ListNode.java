package dsa.LinkedList;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        ListNode curr = createLL(arr);
        printLL(curr);
    }

    public static ListNode createLL (int[] arr) {
        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int i = 0; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head.next;
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
    }
}
