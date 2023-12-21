import java.util.*;

public class rightrotatelist {
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
        ListNode head = new Solution().rotateRight(head1, b);

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

// class Solution {
// public ListNode rotateRight(ListNode A, int B) {
// int count = 0;
// ListNode temp, temp1;
// temp = temp1 = A;
// while (temp != null) {
// ++count;
// temp = temp.next;
// }
// B = B % count;

// ListNode ans = new ListNode(-1);
// ListNode ans2 = ans;

// int rest = count - B;
// while (rest > 0) {
// ListNode a = new ListNode(temp1.val);
// temp1 = temp1.next;
// ans2.next = a;
// ans2 = ans2.next;
// --rest;
// }
// ListNode rr = new ListNode(-1);
// ListNode rr2 = rr;
// while (B > 0) {
// ListNode a = new ListNode(temp1.val);
// rr2.next = a;
// temp1 = temp1.next;
// rr2 = rr2.next;
// --B;
// }
// rr2.next=ans.next;
// return rr.next;

// }

// }







class Solution {
   public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int n = 0;
        ListNode temp, temp1;
        temp = temp1 = head;
        while (temp != null) {
            ++n;
            temp = temp.next;
        }
        k = k % n;
        if (k == 0)
            return head;
        ListNode next = temp1.next;
        for (int i = 1; i < n - k; i++) {
            temp1 = temp1.next;
            next = temp1.next;
        }
        temp1.next=null;
        ListNode newhead=next;
        while(next.next !=null)next=next.next;
        next.next=head;
        return newhead;
    }
}





















// class Solution {
//     public ListNode rotateRight(ListNode A, int B) {
//         if (A == null || A.next == null || B == 0) {
//             return A;
//         }
//         int n = 1;
//         ListNode temp = A;
//         while (temp.next != null) {
//             temp = temp.next;
//             n++;
//         }
//         B = B % n;
//         if (B == 0) {
//             return A;
//         }
//         int k = n - B;
//         temp.next = A; 
//         temp = A;
//         for (int i = 1; i < k; i++) {
//             temp = temp.next;
//         }
//         ListNode newHead = temp.next;
//         temp.next = null; 
        
//         return newHead;
//     }
// }

