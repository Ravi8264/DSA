class intersection{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        // ListNode a5 = new ListNode(0);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        // a4.next = a5;

        ListNode head2 = new ListNode(9);
        ListNode b1 = new ListNode(8);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(10);
        ListNode b4 = new ListNode(11);
        ListNode b5 = new ListNode(12);
        head2.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next=b5;

        int count = new Solution().findIntersection(head, head2);
        System.out.println(count);
        //print(head1);
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
//    public static int findIntersection(ListNode firstHead, ListNode secondHead) {
//        int count=0;
//    ListNode a=firstHead;
//    int i=0;
//    while(a !=null && i>=0){
//         boolean flag=false;
//         ListNode b=secondHead;
//        while(b!=null){
//            if(a.val==b.val) {
//                flag=true;
//                break;
//            }
//            b=b.next;
//        }
//        if(flag){
//           return a.val;
//        }
//        a=a.next;
//    }
//      return count;
//    }
//}


 class Solution {
    public static int findIntersection(ListNode firstHead, ListNode secondHead) {

        ListNode a = firstHead;
        ListNode b = secondHead;
        while (a != b) {

            a = (a == null) ? secondHead : a.next;
            b = (b == null) ? firstHead : b.next;
         
        }
        return (a != null) ? a.val : -1;
    }
}