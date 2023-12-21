public class reverversellfromk {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        // ListNode a2 = new ListNode(3);
        // ListNode a3 = new ListNode(4);
        // ListNode a4 = new ListNode(5);
        // ListNode a5 = new ListNode(6);
        head.next = a1;
        // a1.next = a2;
        // a2.next = a3;
        // a3.next = a4;
        // a4.next = a5;
        ListNode head1 = new Solution().reverseKGroup(head, 2);
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


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode temp = head, temp1 = null;
        int count = 1;
        System.out.println("a");
        while (count < k && temp != null) {
            temp = temp.next;
            ++count;
        }
        if (temp == null) {
            return head;
        }
         temp1 = temp.next;
         temp.next = null;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode prevAdd = prev;
        while (prevAdd.next != null) {
            prevAdd = prevAdd.next;
        }
        prevAdd.next = reverseKGroup(temp1, k);
         return prev;

    }
}

// kuch variables name ki full form likh deta hu taaki easier ho jaaye samajhna-
// gh - global head (final list ka head)
// gt - global tail (final list ki tail)
// th - temporary head
// tt - temporary tail

// class Solution {
// ListNode gh=null, gt=null, th=null, tt=null;
// public ListNode reverseKGroup(ListNode A, int B) {
// if(A == null || A.next == null) return A;
// ListNode curr = A;
// int val = B, len = findLen(A);
// while(curr != null && len >= B){
// while(curr!=null && val > 0){
// ListNode forw = curr.next;
// curr.next = null;
// reverse(curr);
// curr = forw;
// val--;
// }
// if(gh == null){
// gh = th;
// gt = tt;
// }
// else{
// gt.next = th;
// gt = tt;
// }
// th = null;
// tt = null;
// len -= B;
// val = B;
// }
// return gh;
// }

// public int findLen(ListNode A){
// int len = 0;
// ListNode curr = A;
// while(curr != null){
// len++;
// curr = curr.next;
// }
// return len;
// }

// public void reverse(ListNode A){
// if(th == null){
// th = A;
// tt = A;
// }
// else{
// A.next = th;
// th = A;
// }
// }
// }