// import java.util.*;

// public class LifeCycle {
//     public static void main(String[] args) {
//         ListNode head1 = null, node1, curr1 = null;

//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();

//         while (n > 0) {
//             node1 = new ListNode(0);
//             if (head1 == null)
//                 head1 = node1;
//             if (curr1 != null) {
//                 curr1.next = node1;
//             }
//             node1.val = scn.nextInt();
//             curr1 = node1;
//             if(n==1)node1.next=head1.next.next;
//             n--;

//         }

//         //new Solution().detectCycle(head1);
//          print(head1);
//     }

//     static void print(ListNode head) {
//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }
// }

// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int data) {
//         this.val = data;
//         this.next = null;
//     }
// }

import java.util.Scanner;

class LifeCycle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode ans;
        if (n == 5) {
            ListNode head = new ListNode(1);
            ListNode a1 = new ListNode(2);
            ListNode a2 = new ListNode(3);
            ListNode a3 = new ListNode(4);
            ListNode a4 = new ListNode(3);
            head.next = a1;
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            a4.next = a2;
            ans = new Solution().detectCycle(head);
            print(ans);
        }
        if (n == 6) {
            ListNode head = new ListNode(1);
            ListNode a1 = new ListNode(2);
            ListNode a2 = new ListNode(3);
            ListNode a3 = new ListNode(4);
            ListNode a4 = new ListNode(5);
            ListNode a5 = new ListNode(6);
            head.next = a1;
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            a4.next = a5;
            ans = new Solution().detectCycle(head);
            print(ans);
        }
        if (n == 7) {
            ListNode head = new ListNode(1);
            ListNode a1 = new ListNode(2);
            ListNode a2 = new ListNode(3);
            ListNode a3 = new ListNode(4);
            ListNode a4 = new ListNode(5);
            ListNode a5 = new ListNode(6);
            ListNode a6 = new ListNode(6);
            head.next = a1;
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            a4.next = a5;
            a5.next = a5;
            ans = new Solution().detectCycle(head);
            print(ans);
        }
        if (n == 2) {
            ListNode head = new ListNode(1);
            head.next = head;
            ans = new Solution().detectCycle(head);
            print(ans);
        }

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

class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return new ListNode(-1);
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        ListNode ans = new ListNode(-1);
        if (fast == null || fast.next == null)
            return ans;

        ListNode left = head;
        while (left.val != fast.val) {
            left = left.next;
            fast = fast.next;
        }
        ans.val = left.val;
        return ans;
    }
}

// class Solution457 {
// public ListNode detectCycle(ListNode A) {
// if (A == null || A.next == null)
// return new ListNode(-1);
// ListNode slow = A;
// ListNode fast = A;
// boolean flag = false, flag2 = false;
// while (fast != null && fast.next != null) {
// // System.out.println(fast.val+" "+slow.val);
// if (slow == fast && flag2) {
// flag = true;
// break;
// }
// flag2 = true;
// slow = slow.next;
// fast = fast.next.next;
// }
// ListNode ans = new ListNode(-1);

// ListNode left = A;
// ListNode right = A.next; //1 2 3 4 5 3
// if (left == right.next) {
// ans.val = A.val;
// return ans;
// }
// if (flag) {
// while (left.val != right.val) {
// left = left.next;
// right = right.next;
// }
// ans.val = right.val;
// }

// return ans;
// }
// }