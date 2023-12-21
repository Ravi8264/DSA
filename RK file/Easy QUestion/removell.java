
import java.util.*;

public class removell {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        // ListNode a5 = new ListNode(0);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        // a4.next = a5;
        ListNode head1 = new Solution().removeNthFromEnd(head, 5);

        print(head1);
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "   ");
            head = head.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode prev = null;
        ListNode curr1, curr2;
        curr1 = curr2 = A;
        int count = 0;

        while (curr2 != null) {
            ++count;
            curr2 = curr2.next;
        }
        if (B >= count)
            return A.next;
        int c = count - B;
        System.out.println(B);
        if (c <= 0)
            return A;

        while (c > 0 && curr1 != null) {
            prev = curr1;
            curr1 = curr1.next;
            c--;
        }
        if (B == count) {
            prev.next = null;
        } else {
            prev.next = curr1.next;
        }

        return A;
    }
}