import java.util.*;

public class Kth_middle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode f1 = new ListNode(2, null);
        ListNode f2 = new ListNode(3, null);
        ListNode f3 = new ListNode(4, null);
        ListNode f4 = new ListNode(5, null);
        ListNode f5 = new ListNode(6, null);
        ListNode f6 = new ListNode(12, null);
        ListNode f7 = new ListNode(12, null);
        ListNode f8 = new ListNode(12, null);
        ListNode f9 = new ListNode(12, null);
        head.next = f1;
        f1.next = f2;
        f2.next = f3;
        f3.next = f4;
        f4.next = f5;
        f5.next = f6;
        f6.next = f7;
        f7.next = f8;
        f8.next = f9;

        System.out.println(new Solution().kthNode(head, 1));

        print(head);
    }

    static void print(ListNode head) {
        while (head != null) {

            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public int kthNode(ListNode head, int B) {
        ListNode slow = head, fast = head;
        int count = 0;

        while (slow != null) {
            ++count;
            slow = slow.next;

        }
        if (count % 2 != 0) {
            count = (count + 1) / 2 - B;
        }
        else{
          count = (count/2 + 1) - B;  
        }
        if (count <= 0)
            return -1;
        int val = 1;
        while (head != null) {
            if (val == count) {
                return head.val;
            }
            ++val;
            head = head.next;
        }
        return 0;

    }
}