import java.util.*;;

public class Longest_Palindrome_List {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode a1 = new ListNode(2);
    ListNode a2 = new ListNode(3);
    ListNode a3 = new ListNode(2);
    ListNode a4 = new ListNode(1);
    // ListNode a5 = new ListNode(6);
    head.next = a1;
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    // a4.next = a5;

    int ans = new Solution().isPalin(head);
    System.out.println(ans);
    // print(head1); // This prints the reversed linked list
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

// class Solution {
// public int maxPalindrome(ListNode head) {
// int max = 0;
// ListNode newlinkedlist = new ListNode(0);
// ListNode b = newlinkedlist;
// ListNode c = head;
// while (c != null) {
// ListNode a = new ListNode(c.val);
// b.next = a;
// b = b.next;
// c = c.next;
// }

// ListNode prev = null;
// ListNode curr = head;
// while (curr != null) {
// ListNode next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }
// // System.out.println("new");
// // print(newlinkedlist.next);
// // System.out.println();
// // System.out.println("opp");
// // print(prev);

// ListNode newlinkedlist1 = newlinkedlist.next;
// while (newlinkedlist1 != null) {
// max = Math.max(checkPlindrome(newlinkedlist1, prev), max);
// // System.out.println(max);
// newlinkedlist1 = newlinkedlist1.next;
// }
// return max;
// }

// private int checkPlindrome(ListNode curr, ListNode pre) {
// int max = 0;
// // System.out.println();
// // System.out.println(curr.val + " " + pre.val);
// while (pre != null) {
// int max2 = 0;
// ListNode c = curr;
// ListNode d = pre;
// while (c != null && d != null && d.val == c.val) {
// ++max2;
// // System.out.println(c.val + " " + d.val);
// d = d.next;
// c = c.next;
// }
// max = Math.max(max, max2);
// pre = pre.next;
// }
// return max;
// }

// static void print(ListNode head) {
// while (head != null) {
// System.out.print(head.val + " ");
// head = head.next;
// }
// }
// }

// class Solution {
// public int maxPalindrome(ListNode head) {
// int max = 0;
// ListNode newlinkedlist = new ListNode(0);
// ListNode b = newlinkedlist;
// ListNode c = head;
// while (c != null) {
// ListNode a = new ListNode(c.val);
// b.next = a;
// b = b.next;
// c = c.next;
// }
// ListNode prev = null;
// ListNode curr = head;
// while (curr != null) {
// ListNode next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }
// ListNode newlinkedlist1 = newlinkedlist.next;
// // while (newlinkedlist1 != null) {
// max = Math.max(checkPlindrome(newlinkedlist1, prev), max);
// newlinkedlist1 = newlinkedlist1.next;
// // }
// return max;
// }

// private int checkPlindrome(ListNode curr, ListNode pre) {
// int max = 0;
// while (pre != null) {
// int max2 = 0;
// ListNode c = curr;
// ListNode d = pre;
// while (c != null && d != null && d.val == c.val) {
// ++max2;
// d = d.next;
// c = c.next;
// }
// max = Math.max(max, max2);
// pre = pre.next;
// }
// return max;
// }

// }









// class Solution {
//   public int isPalin(ListNode A) {
//     // You can code here
//     if (A == null || A.next == null)
//       return 1;
//     ListNode temp1 = A;
//     ListNode head1 = new ListNode(0);
//     ListNode dummy = head1;
//     while (temp1 != null) {
//       ListNode a = new ListNode(temp1.val);
//       dummy.next = a;
//       dummy = dummy.next;
//       temp1 = temp1.next;
//     }

//     ListNode temp2 = reverseList(A);

//     System.out.println();
//     print(head1.next);
//     print(temp2);
//     //System.out.println(checkEquals(temp2, head1.next));
//     if (checkEquals(temp2, head1.next))return 1;
//     System.out.println();
//     return 0;
//   }

//   public ListNode reverseList(ListNode head) {
//     if (head == null || head.next == null)
//       return head;
//     ListNode prev = null;
//     ListNode curr = head;
//     while (curr != null) {
//       ListNode next = curr.next;
//       curr.next = prev;
//       prev = curr;
//       curr = next;
//     }
//     return prev;
//   }

//   public boolean checkEquals(ListNode node1, ListNode node2) {
//     while (node1 != null) {
//       if (node1.val != node2.val)
//         return false;
//       node1 = node1.next;
//       node2=node2.next;
//     }
//     return true;
//   }

//   static void print(ListNode head) {
//     while (head != null) {
//       System.out.print(head.val + "   ");
//       head = head.next;
//     }
//     System.out.println();
//   }
// }