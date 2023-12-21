public class mergeTwoSortedll {
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

        ListNode head2 = new ListNode(1);
        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        ListNode b4 = new ListNode(5);
        head2.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;

        ListNode head1 = new Solution().mergeTwoLists(head, head2);

        print(head1);
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

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                System.out.println(list1.val);
                curr.next = list1;
                list1 = list1.next;

            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;

        }
        curr.next = list1 == null ? list2 : list1;
        return head.next;
    }
}