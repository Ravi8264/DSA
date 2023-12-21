import java.util.ArrayDeque;
import java.util.Arrays;

public class infix_to_postfix {
    public static void main(String[] args) {
        String str = "A * (B + C) + D * (E + F)";
        System.out.println(new Solution().infixToPostfix(str));
    }

}

// class Solution {
// static int precendence(char c) {
// switch (c) {
// case '^':
// return 3;
// case '*':
// case '/':
// return 2;
// case '+':
// case '-':
// return 1;
// default:
// return -1;

// }
// }

// static boolean isOperator(char c) {
// return c == '^' || c == '*' || c == '+' || c == '-' || c == '/';
// }
//
//
//
//
//
// public static String infixToPostfix(String infixExpression) {
// int n = infixExpression.length();
// StringBuilder ans = new StringBuilder();
// String removespace = infixExpression.replaceAll("\\s+", "");
// ArrayDeque<Character> st = new ArrayDeque<>();
// for (int i = 0; i < removespace.length(); i++) {
// char c = removespace.charAt(i);
// // System.out.println(c);
// if (c == '(') {
// st.push(c);
// } else if (isOperator(c)) {
// while (!st.isEmpty() && precendence(st.peek()) >= precendence(c)) {
// String temp = Character.toString(st.pop());
// ans.append(temp);
// }
// st.push(c);
// } else if (c == ')') {

// while (!st.isEmpty() && st.peek() != '(') {
// String temp = Character.toString(st.pop());
// ans.append(temp);
// }
// st.pop();

// } else {
// ans.append(c);
// }
// }
// while (!st.isEmpty()) {
// String temp = Character.toString(st.pop());
// ans.append(temp);
// }
// return ans.toString();

// }

// }

class Solution {
    static boolean isOperator(String infixExpression) {
        return infixExpression.equals("+") || infixExpression.equals("-") ||
                infixExpression.equals("*") || infixExpression.equals("/") || infixExpression.equals("^");
    }

    static int precedence(String infixExpression) {
        switch (infixExpression) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;

            default:
                return -1;

        }
    }

    public static String infixToPostfix(String infixExpression) {

        String tokens[] = infixExpression.split("");
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(tokens));
        for (String token : tokens) {
            if (token.equals(" ")) {
                System.out.println("a");
                continue;
            } else {
                if (token.equals("(")) {
                    stack.push(token);
                } else if (isOperator(token)) {
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                        String temp = stack.pop();
                        sb.append(temp).append(" ");
                    }
                    System.out.println(token);
                    stack.push(token);
                } else if (token.equals(")")) {

                    while (!stack.isEmpty() && !stack.peek().equals("(")) {
                        String temp = stack.pop();
                        sb.append(temp).append(" ");
                    }
                    stack.pop();
                } else { // operand
                    sb.append(token).append(" ");
                }
            }

        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString();
    }
}
