import java.util.*;

public class sortll {
    public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n > 0) {
            node1 = new ListNode(0);
            if (head1 == null)
                head1 = node1;
            if (curr1 != null) {
                curr1.next = node1;
            }
            node1.val = scn.nextInt();
            curr1 = node1;
            n--;
        }
        ListNode head = new Solution().sortList(head1);

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

    ListNode(int val) {
        this.val = val;
    }
}


class Solution {
    public ListNode sortList(ListNode A) {
        if (A == null || A.next == null)
            return A;
        ListNode prev = null, slow = A, fast = A;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(A);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }
    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null)
            p.next = l1;
        if (l2 != null)
            p.next = l2;
        return l.next;
    }
}