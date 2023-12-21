
import java.util.Stack;

class myqueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void push(int x) {
        s1.push(x);
    }

    int pop() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        } else if (!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int a = s2.pop();
        return a;
    }

    public static void main(String[] args) {
        myqueue q = new myqueue();
        System.out.println(q.pop());
        q.push(4);
        q.push(5);
        System.out.println(q.pop());
        // System.out.println(q.pop());
        q.push(6);
        q.push(7);
        System.out.println(q.pop());
    }
}
