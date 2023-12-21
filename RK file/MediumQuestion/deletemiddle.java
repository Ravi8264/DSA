
import java.util.*;

public class deletemiddle {
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
     ListNode  head= new Solution().deleteMiddle(head1);

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


class Solution{
     public static ListNode deleteMiddle(ListNode head) {
         if(head==null ||head.next==null) return null;
          ListNode slow=head;
          ListNode fast=head;
          ListNode prev=null;
          while(fast!=null && fast.next !=null){
              prev=slow;
              slow=slow.next;
              fast=fast.next.next;
          }
          prev.next=slow.next;
          return  head;
        }
}