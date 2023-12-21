import java.util.Stack;

public class binarysum {
    public static void main(String[] args) {
        String a = "101";
        String b = "10";
        System.out.println(new Solution().addBinary(a, b));

    }

}

// class Solution {
// public String addBinary(String a, String b) {

// int val = value(a) + value(b);
// String ans = convertBinary(val);
// return ans;
// }

// int value(String a) {
// int ans = 0, j = 0;
// for (int i = a.length() - 1; i >= 0; i--) {
// if (a.charAt(i) == '1') {
// ans += Math.pow(2, j);
// }
// j++;
// }
// return ans;
// }

// String convertBinary(int val) {
// Stack<Integer> stack = new Stack<>();
// String ans = "";
// while (val > 0) {
// stack.push(val % 2);
// val = val / 2;
// }
// while (!stack.isEmpty()) {
// ans += stack.pop();
// }

// return ans;

// }
// }
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            // result.append(sum % 2);
            result.insert(0,sum%2);
            carry = sum / 2;
        }
        return result.toString();
    }
}