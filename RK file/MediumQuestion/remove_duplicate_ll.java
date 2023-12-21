public class remove_duplicate_ll {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a1 = new Node(4);
        Node a2 = new Node(4);
        Node a3 = new Node(4);
        Node a4 = new Node(4);
        Node a5 = new Node(4);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        Node head1 = new Solution().deleteDuplicates(head);
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
    public Node deleteDuplicates(Node head) {
        Node temp = head;
        Node orig = head;
        Node newHead = null;
       

        while (orig != null) {
            while (orig.next != null && orig.val == orig.next.val) {
                orig = orig.next;
            }
            if (newHead == null) {
                newHead = temp = orig;
            } else { 
                temp.next = orig;
                temp = orig;
            }
            orig = orig.next;
        }
    }