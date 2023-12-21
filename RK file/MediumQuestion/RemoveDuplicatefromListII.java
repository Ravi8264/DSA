public class RemoveDuplicatefromListII {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(3);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        ListNode head1 = new Solution().deleteDuplicates(head);
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
// public static ListNode deleteDuplicates(ListNode head) {
// ListNode temp = head;
// ListNode curr = head;
// ListNode newHeadNode = new ListNode(0);
// ListNode copy = newHeadNode;// 1 2 4 4
// boolean flag2 = true;
// while (curr != null) {
// // System.out.println("a");
// boolean flag1 = true;
// while (curr.next != null && curr.val == curr.next.val) {
// flag1 = false;
// curr = curr.next;
// }
// if (flag2 && flag1) {
// ListNode b = new ListNode(curr.val);
// copy.next = b;
// copy = copy.next;
// flag2 = !flag2;

// } else {
// if (flag1) {
// ListNode b = new ListNode(curr.val);
// copy.next = b;
// copy = copy.next;
// }

// }
// curr = curr.next;
// }
// return newHeadNode.next;
// }
// }

// class Solution{
// public static ListNode deleteDuplicates(ListNode head) {
// ListNode prev = new ListNode(-3000);
// ListNode dummy = prev;
// ListNode curr = head;
// boolean flag = false;

// while(curr != null){
// if(curr.next != null && curr.next.val == curr.val){
// flag = true;
// while(curr.next != null && curr.next.val == curr.val) curr = curr.next;
// curr = curr.next;
// }
// else{
// flag = false;
// prev.next = curr;
// prev = curr;
// curr = curr.next;
// }
// }
// if(flag == true) prev.next = curr;
// return dummy.next;
// }
// }

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode curr = head;
        ListNode newHeadNode = new ListNode(0);
        ListNode copy = newHeadNode;// 1 2 4 4
        boolean flag2 = true;
        while (curr != null) {
            boolean flag1 = true;
            while (curr.next != null && curr.val == curr.next.val) {
                flag1 = false;
                curr = curr.next;
            }
            if (flag2 && flag1) {
                copy.next = curr;
                copy = copy.next;
                copy.next=null;
                flag2 = !flag2;
            } else {
                if (flag1) {
                    copy.next = curr;
                    copy = copy.next;

                }
            }
            curr = curr.next;
        }
        return newHeadNode.next;
    }
}