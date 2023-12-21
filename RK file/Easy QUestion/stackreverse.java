import java.util.*;

public class stackreverse {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Stack<Integer> st = new Stack<>();
        int i = a.length - 1;
        while (i >= 0) {
            st.push(a[i]);
            --i;
        }
        new Solution().reverseStack(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + "  ");
        }

    }
}

class Solution {
    public void reverseStack(Stack<Integer> s) {
        // You can code here
        Stack<Integer> ans = new Stack<>();
        reverse(s, ans);
        while (!ans.isEmpty()) {
            s.push(ans.pop());
        }

    }

    void reverse(Stack<Integer> s, Stack<Integer> ans) {
        if (s.isEmpty())
            return;
        int a = s.pop();
        reverse(s, ans);
        ans.push(a);
    }
}

// class Solution {
// public void reverseStack(Stack<Integer> s) {
// Stack<Integer> ans = new Stack<>();
// reverse(s, ans);

// // Modify the input stack in place after reversing
// while (!ans.isEmpty()) {
// s.push(ans.pop());
// }
// }

// void reverse(Stack<Integer> s, Stack<Integer> ans) {
// if (s.isEmpty()) {
// return;
// }
// int a = s.pop();
// reverse(s, ans);
// ans.push(a);
// }
// }
