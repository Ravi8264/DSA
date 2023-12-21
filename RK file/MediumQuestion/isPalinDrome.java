
public class isPalinDrome {
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
        int val = new Solution().isPalin(head);
        System.out.println(val);
        // print(head1);
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
//     public int isPalin(ListNode A) {
//         ListNode head = A;
//         ListNode middle = Middle_of_ll(A);
//         ListNode reverese = reverse_from_middle(middle);
//         while(reverese !=null){
//             if(reverese.val!=head.val){
//                 return 0;
//             }
//             reverese=reverese.next;
//             head=head.next;
//         }
//         return 1;
//     }

//     private ListNode reverse_from_middle(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
//         while (current != null) {   
//             ListNode next = current.next; 
//             current.next = prev;  
//             prev = current;
//             current = next;
//         }
//         return prev;
//     }

//     ListNode Middle_of_ll(ListNode A) {
//         ListNode slow = A;
//         ListNode fast = A;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
// }



//  class Solution {
//     public int isPalin(ListNode A) {
//       //You can code here
//       ListNode middle = findMid(A);
//       ListNode t2 = reverse(middle);
//       ListNode t1 = A;
//       while(t2 != null){
//         if(t1.val != t2.val){ return 0;}
//         t1 = t1.next;
//         t2 = t2.next;
//       }
//       return 1;
//     }
//     public ListNode findMid(ListNode head){
//      ListNode slow = head;
//      ListNode fast = head;
//      while(fast != null && fast.next != null){
//        slow = slow.next;
//        fast = fast.next.next;
//      }
//      return slow;
//    }
//    public ListNode reverse(ListNode head){
//      ListNode prev = null;
//      ListNode curr = head;
//      while(curr != null){
//        ListNode next = curr.next;
//        curr.next = prev;
//        prev = curr;
//        curr = next;
//      }
//      return prev;
//    }
// }

/* class ListNode {
    int val;
    ListNode next;
    ListNode() { val = 0; next = null; }
    ListNode(int val) { this.val = val; next = null; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
} */

class Solution {
    public int isPalin(ListNode head) {
      //You can code here

      ListNode mid=middle(head);
      ListNode t2=reverse(mid);
      ListNode t1=head;

      while(t2!=null){
        if(t1.val != t2.val){
          return 0;
        }
        else{t1=t1.next;
        t2=t2.next;}
      }
      return 1;
    }

  public ListNode reverse(ListNode head){

    if(head==null || head.next==null){
      return head;
    }

    ListNode newSubhead=reverse(head.next);
    head.next.next=head;
    head.next=null;

    return newSubhead;
  }

  public ListNode middle(ListNode head){

    ListNode slow=head;
    ListNode fast=head;

    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }

    return slow;
  }
}