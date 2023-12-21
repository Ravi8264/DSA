import org.w3c.dom.NodeList;

public class SwapListNodesnpairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        // ListNode a5 = new ListNode(6);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        // a4.next = a5;
        ListNode head1 = new Solution().swapPairs(head);
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
//       public ListNode swapPairs(ListNode A) {
//         if (A == null || A.next == null) {
//             return A; 
//         }
//         ListNode newHead = A.next;
//         ListNode previous = null;
//         while (A != null && A.next != null) {
//             ListNode first = A;
//             ListNode second = A.next;
//             ListNode nextPair = second.next;

//             second.next = first;
//             first.next = nextPair;

//             if (previous != null) {
//                 previous.next = second;
//             }

//             previous = first;
//             A = nextPair;
//         } 

//         return newHead;
    
//     }
// }



class Solution {
      public ListNode swapPairs(ListNode A) {
        if (A == null || A.next == null) {
            return A; 
        }
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy,curr=A;
        dummy.next=A;
        while(curr !=null && curr.next !=null){
            prev.next=curr.next;
            curr.next=prev.next.next;
            prev.next.next=curr;
            curr=curr.next;
            prev=prev.next.next;
           
        }
    return dummy.next;
    }
}


// class Solution {
// public ListNode swapPairs(ListNode A) {
// ListNode temp1, temp2, newHead = null;
// temp1 = temp2 = A;
// ListNode head = new ListNode(0);
// ListNode ans=head,prev=null;;
// int count = 0;
// while (temp2 != null) {
// ++count;
// // System.out.println(temp2.val);
// if (count % 2 == 0) {
// ListNode val1 = new ListNode(temp1.val);
// ListNode val2 = new ListNode(temp2.val);
// ans.next = val2;
// ans=ans.next;
// ans.next = val1;
// ans=ans.next;
// temp1 = temp2.next;
// }
// prev=temp2;
// temp2 = temp2.next;
// }
// if(count%2 !=0) ans.next=prev;
// return head.next;

// }
// }