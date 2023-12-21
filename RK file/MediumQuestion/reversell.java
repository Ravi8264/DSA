
public class reversell {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a1 = new Node(2);
        Node a2 = new Node(3);
        Node a3 = new Node(4);
        Node a4 = new Node(5);
        Node a5 = new Node(6);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        Node head1 = new Solution().reverseList(head);
        print(head1);
    }

    static void print(Node head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}

class Node {
    int val;
    Node next;

    Node(int data) {
        this.val = data;
        this.next = null;
    }
}

class Solution {
    public Node reverseList(Node head) {
        // You can code here
        if (head == null || head.next == null)
            return head;
        Node prev = head;
        Node curr = head.next;
        head.next=null;
        while (curr != null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        return prev;
    }
}