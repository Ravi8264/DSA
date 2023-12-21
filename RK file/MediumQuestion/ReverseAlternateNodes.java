
import java.util.*;

public class ReverseAlternateNodes {
    public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
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
        ListNode head = new Solution().solve(head1, b);

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

    public ListNode solve(ListNode A, int B) {
        ListNode temp = A;
        int count = 1;
        boolean start = true;
        ListNode a = null;
        while (temp != null) {
            if (start) {
                a = temp;
            }
            if (count % B == 0) {
                if (temp.next != null) {
                    ListNode next = temp.next;
                }
                start=!start;
            }
            start = !start;
            temp = temp.next;
        }

        return null;

    }

    ListNode reverse(ListNode rev) {
        ListNode prev = null;
        ListNode curr = rev;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}