
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        while (p > 0) {
            node1 = new ListNode(0);
            if (head1 == null)
                head1 = node1;
            if (curr1 != null) {
                curr1.next = node1;
            }
            node1.val = scn.nextInt();
            curr1 = node1;
            p--;
        }
        ListNode head = new Solution().reverseBetween(head1, m, n);

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
    public ListNode reverseBetween(ListNode A, int m, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode dummy2 = dummy;
        ListNode temp, temp2;
        temp = temp2 = A;
        int count = 1, count2 = 1;
        while (temp != null) {
            if (count >= m && count <= n) {
                ListNode a = new ListNode(temp.val);
                dummy2.next = a;
                dummy2 = a;
            }
            temp = temp.next;
            ++count;
        }
        ListNode rev = reverse(dummy.next);
        while (temp2 != null) {
            if (count2 >= m && count2 <= n) {
                temp2.val = rev.val;
                rev = rev.next;
            }
            temp2 = temp2.next;
            ++count2;
        }
        return A;
    }
    ListNode reverse(ListNode dummy) {
        ListNode prev = null;
        ListNode curr = dummy;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}