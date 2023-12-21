import java.util.*;

public class addsumll {
    public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        ListNode head2 = null, node2, curr2 = null;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
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
        while (m > 0) {
            node2 = new ListNode(0);
            if (head2 == null)
                head2 = node2;
            if (curr2 != null)
                curr2.next = node2;
            node2.val = scn.nextInt();
            curr2 = node2;
            m--;
        }
        ListNode headAns = new Solution().addTwoNumbers(head1, head2);

        print(headAns);
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
// class Solution {
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
// ListNode node;
// ListNode first = null;
// ListNode prev = null;
// int carry = 0;
// while (l1 != null || l2 != null || carry != 0) {
// node = new ListNode(0);
// int sum = carry;
// if (first == null) {
// first = node;
// }
// if (prev != null) {
// prev.next = node;
// }
// if (l1 != null) {
// sum += l1.val;
// l1 = l1.next;
// }
// if (l2 != null) {
// sum += l2.val;
// l2 = l2.next;
// }
// node.val = sum % 10;
// carry = sum / 10;
// prev = node;
// }
// return reverse(first);
// }
// ListNode reverse(ListNode head){
// ListNode prev=head;
// ListNode curr=head.next;
// head.next=null;
// while(curr !=null){
// ListNode node=curr.next;
// curr.next=prev;
// prev=curr;
// curr=node;
// }
// return prev;
// }
// }



class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {

        ListNode l1 = reverse(A);
        ListNode l2 = reverse(B);
        ListNode head = new ListNode(0);
        ListNode ans = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            // System.out.println(l1.val + " " + l2.val);
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            // System.out.println(sum);
            int digit = sum % 10;
            carry = sum / 10;
            ListNode newNenode = new ListNode(digit);
            ans.next = newNenode;
            ans = ans.next;
        }
       // print(head);
        return reverse(head.next);
    }

    public ListNode reverse(ListNode A) {
        if (A == null || A.next == null)
            return A;
        ListNode prev = A;
        ListNode curr = A.next;
        A.next = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
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