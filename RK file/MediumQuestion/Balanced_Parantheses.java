import java.util.ArrayDeque;

public class Balanced_Parantheses {
    public static void main(String[] args) {
        String a = "{}";
        System.out.println(new Solution().isBalanced(a));
    }
}

class Solution {
    int isBalanced(String A) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '[' || A.charAt(i) == '(' || A.charAt(i) == '{') {
                stack.push(A.charAt(i));
            } else {
                if(stack.isEmpty()) return 0;
                if (A.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (A.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (A.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else
                    return 0;
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }

        return 0;

    }
}