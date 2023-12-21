
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;

    }
}

public class evenreverse {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        ListNode a5 = new ListNode(6);
        ListNode a6 = new ListNode(7);
        ListNode a7 = new ListNode(8);
        // ListNode a8 = new ListNode(9);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        // a7.next = a8;
        print(head);
        solve(head);

    }

    static void print(ListNode head) {
        System.out.println();
        while (head != null) {
            System.out.print(head.val + "  ");
            head = head.next;

        }
    }

    public static void solve(ListNode head) {

        if (head == null || head.next == null || head.next.next == null)
            return;

        ListNode odd = head;// 1->3->5->7->9
        ListNode even = head.next;// 2->4->6->8
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        if (odd.next != null)
            odd.next = null;

        print(evenHead);
        print(head);

        ListNode reversedEven = reversedList(evenHead);
        print(reversedEven);
        ListNode newhead = head;

        while (reversedEven != null &&head != null) {
            ListNode headNext = head.next; 
            ListNode reverListNodeNext = reversedEven.next;
            head.next = reversedEven;
            reversedEven.next = headNext;
            reversedEven = reverListNodeNext;//
            head = headNext;// 7
        }
        if (reversedEven != null)
            head.next = reversedEven;
       
        print(newhead);
    }

    public static ListNode reversedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }
}
