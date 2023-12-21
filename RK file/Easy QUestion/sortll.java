import java.util.List;

import org.w3c.dom.NodeList;

public class sortll {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(0);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(1);
        // ListNode a5 = new ListNode(0);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        // a4.next = a5;
        ListNode head1 = new Solution().sortBinaryList(head);

        print(head1);
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
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
// public ListNode sortBinaryList(ListNode A) {
// int count1 = 0;
// int count2 = 0;
// ListNode temp;
// temp = A;
// while (temp != null) {
// if (temp.val == 0)
// ++count1;
// if (temp.val == 1)
// ++count2;
// temp = temp.next;

// }
// ListNode head = new ListNode(0);
// ListNode ans = head;
// while (count1 > 0) {
// ListNode a = new ListNode(0);
// ans.next = a;
// ans = ans.next;
// --count1;
// }
// while (count2 > 0) {
// ListNode a = new ListNode(1);
// ans.next = a;
// ans = ans.next;
// --count2;
// }
// // System.out.println("a" + " " + head.val);
// return head.next;
// }
// }

class Solution {
    public ListNode sortBinaryList(ListNode A) {
        ListNode temp = A;
        ListNode head = new ListNode(0);
        ListNode ans = head;
        ListNode head2 = new ListNode(1);
        ListNode ans2 = head2;
        while (temp != null) {
            if (temp.val == 0) {
                ListNode a = new ListNode(0);
                ans.next = a;
                ans = ans.next;
            }
            if (temp.val == 1) {
                ListNode a = new ListNode(1);
                ans2.next = a;
                ans2 = ans2.next;
            }
            temp = temp.next;

        }
        ans.next=head2.next;
        return head.next;
    }
}