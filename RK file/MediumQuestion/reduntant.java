import java.util.ArrayDeque;

public class reduntant {
    public static void main(String[] args) {
        String a = "(a+b)";
        System.out.println(new Solution().hasRedundantBraces(a));
    }

}

class Solution {
    public boolean hasRedundantBraces(String s) {
        int n = s.length();
        ArrayDeque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
              System.out.println(st);
            if (operator(c) || c == '(') {
                st.push(c);
            } else {
                if (c == ')' && !st.isEmpty()) {
                    boolean cancheck = true;
                    if (operator(st.peek())) {
                        while (st.peek() != '(') {
                            char a = st.pop();
                            if (operator(a)) {
                                cancheck = false;
                            }
                        }
                    }
                        if (cancheck) {
                            return true;
                        }
                        if (!st.isEmpty())
                            st.pop();
                }
            }
        }

        return false;
    }

    boolean operator(char c) {
        return c == '+' || c == '-' || c == '/' || c == '%' || c == '*';
    }
}
