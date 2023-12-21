
import java.util.*;

public class ReverseAlternateKnodell {
    public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int m = scn.nextInt();
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
        ListNode head = new Solution().solve(head1, m);

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
    ListNode solve(ListNode A, int B) {
        ListNode ans = new ListNode(-1);
        ListNode end = A;
        ans.next = A;
        ListNode beforeStart = ans;
        boolean startReverse = true;
        int i = 1;
        while (end != null) {
            if (i % B == 0) {
                if (startReverse) {
                    ListNode start = beforeStart.next, afterEnd = end.next;
                    reverse(start, end);
                    beforeStart.next=end;
                    start.next = afterEnd;
                    beforeStart = start;
                    end = afterEnd;
                    startReverse = false;
                } else {
                    startReverse = true;
                    beforeStart = end;
                    end = end.next;
                }
            } else {
                end = end.next;
            }
            i++;
        }
        return ans.next;
    }
    void reverse(ListNode start, ListNode end) {
        ListNode prev = start;
        ListNode curr = start.next;
        start.next = null;
        while (prev != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}