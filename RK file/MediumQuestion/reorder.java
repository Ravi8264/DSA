
import java.util.Scanner;

public class reorder {
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

        new Solution().reorderList(head1);
        // print(head1);
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

    ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}



class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l2 = reverse(slow);
        ListNode l1 = head;
        while (true) {
            if (l1 == l2) {
                l1.next = null;
                break;
            }
            if (l2.next == null) {
                l1.next = l2;
                l2.next = null;
                break;
            }
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            l1.next = l2;
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
        print(head);
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        return prev;
    }

    
    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
