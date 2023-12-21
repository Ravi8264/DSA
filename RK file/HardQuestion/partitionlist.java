
import java.util.*;
public class partitionlist {
   public static void main(String[] args) {
        ListNode head1 = null, node1, curr1 = null;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b= scn.nextInt();
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
       
        ListNode headAns = new Solution().partition(head1,b);

        print(headAns);
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val=val;
  }
}



class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode left_part = new ListNode(-1);
        ListNode right_part = new ListNode(-1);
        ListNode left = left_part;
        ListNode right = right_part;
        while (temp != null) {
            if (temp.val < x) {
                ListNode add_list = new ListNode(temp.val);
                left.next = add_list;
                left = add_list;
            } else {
                ListNode add_right = new ListNode(temp.val);
                right.next = add_right;
                right = add_right;
            }
            temp = temp.next;
        }
        left.next = right_part.next;
        return left_part.next;
    }

}











// class Solution {
// public ListNode partition(ListNode A, int B) {
// int count = 0;
// ListNode temp = A;
// ListNode dummy = new ListNode(-1);
// ListNode dummy1=dummy;
// while (temp != null) {
// if (temp.val < B) {
// ++count;
// ListNode a = new ListNode(temp.val);
// dummy1.next = a;
// dummy1 = a;
// }
// temp = temp.next;
// }

// ListNode ans=dummy.next;
// ListNode temp2=A;
// print(ans);

// print(temp2);
// while (temp2 !=null){
// if(count>0 && temp2.val== ans.val){
// --count;
// ans=ans.next;
// }
// else{
// ListNode a=new ListNode(temp2.val);
// dummy1.next=a;
// dummy1=a;
// }
// temp2=temp2.next;
// }
// print(dummy.next);

// return dummy.next;
// }
// static void print(ListNode head) {
// System.out.println();
// while (head != null) {
// System.out.print(head.val+" ");
// head = head.next;
// }
// }

// }
