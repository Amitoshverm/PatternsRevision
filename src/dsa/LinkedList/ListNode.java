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
        int[] arr1 = {7, 8, 9, 10};
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ListNode head = createLL(arr);
        ListNode head2 = createLL(arr1);
//        ListNode head3 = createLL(list);
//        printLL(head2);
//        printLL(head);

//        ListNode newHead = insertAtHead(head, 9);
//        printLL(newHead);
//        head = null;
//        ListNode newHead = insertAtTail(head, 10);
//        printLL(newHead);
//        System.out.println();
//        System.out.println(searchK(null, 0));
//        ListNode newHead = deleteNode(head, 1);
//        printLL(newHead);
//        ListNode newHead = reverse(head);
//        printLL(newHead);

//        ListNode h1 = merge(head, head2);
//        printLL(h1);

//        ListNode h1 = reorderMerge(head3);
//        printLL(h1);

        ListNode h3 = merge2Sorted(head, head2);
        printLL(h3);
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

    public static ListNode insertAtHead(ListNode head, int k) {
        if (head == null) {
            return new ListNode(k);
        }
        ListNode temp = new ListNode(k);
        temp.next = head;
        head = temp;

        return head;
    }

    public static ListNode insertAtTail(ListNode head, int k) {
        if (head == null) {
            return insertAtHead(head,k);
        }
        ListNode temp = head;
        ListNode toBeInserted = new ListNode(k);

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toBeInserted;
        toBeInserted.next = null;
        return head;
    }

    public static boolean searchK(ListNode head, int k) {
        if (head == null) {
            return false;
        }
        if (head.val == k) {
            return true;
        }

        ListNode temp = head;
        while(temp != null) {

            if (temp.val == k) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static ListNode deleteNode(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.val == k) {
             return head.next;
        }

        ListNode temp = head;
        while(temp.next != null && temp.next.val != k) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode merge(ListNode h1, ListNode h2) {
        if (h2 == null) {
            return h1;
        }
        else if (h1 == null) {
            return h2;
        }
        else if (h1 == null && h2 == null) {
            return null;
        }

        ListNode curr = h1;
        while (h2 != null) {
            ListNode temp = h2;
            h2 = h2.next;
            temp.next = curr.next;
            curr.next = temp;
            curr.next = curr.next.next;
        }
        return h1;
    }

    public static ListNode reorderMerge(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode h2 = slow.next;
        slow.next = null;
        ListNode h3 = reverse(h2);

        head =  merge(head, h3);
        return head;
    }

    public static ListNode merge2Sorted(ListNode head1, ListNode head2) {
        ListNode head3 = new ListNode(-1);
        ListNode curr = head3;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                curr.next = head1;
                curr = curr.next;
                head1 = head1.next;
            }
            else {
                curr.next = head2;
                curr = curr.next;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            curr.next = head1;
        }
        if (head2 != null) {
            curr.next = head2;
        }
        return head3.next;
    }
}
