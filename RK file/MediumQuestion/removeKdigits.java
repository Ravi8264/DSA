import java.util.*;

public class removeKdigits {
    public static void main(String[] args) {
        String a = "10200";
        System.out.println(new Solution().removeKdigits(a, 1));

    }

}

// class Solution {
// public String removeKdigits(String num, int k) {
// int len = num.length();
// //corner case
// if(k==len)
// return "0";

// Stack<Character> stack = new Stack<>();
// int i =0;
// while(i<num.length()){ // 1 2 3 4 5
// //whenever meet a digit which is less than the previous digit, discard the
// previous one
// while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
// stack.pop();
// k--;
// }
// stack.push(num.charAt(i));//1 2 3 4 5
// i++;
// }
// System.out.println(stack+" "+k);
// // corner case like "1111"
// while(k>0){
// stack.pop();
// k--;
// }

// //construct the number from the stack
// StringBuilder sb = new StringBuilder();
// while(!stack.isEmpty())
// sb.append(stack.pop());
// sb.reverse();

// //remove all the 0 at the head
// while(sb.length()>1 && sb.charAt(0)=='0')
// sb.deleteCharAt(0);

// return sb.toString();
// }
// }
class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return "0";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !st.isEmpty() && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.toString();
    }

}