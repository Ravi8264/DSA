import java.util.*;
import java.util.Scanner;

public class postfix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp=scn.nextLine();
        String a[] = exp.split(" ");
        System.out.println(new Solution().evalPostfix(a));
    }

}

// class Solution {
//     public int evalPostfix(String[] A) {
//         ArrayDeque<Integer> st = new ArrayDeque<>();
//         for (String token : A) {
//             if (isOperator(token)) {
//                 int second = st.pop();
//                 int first = st.pop();
//                 int result = 0;
//                 switch (token) {
//                     case "+":
//                         result = first + second;
//                         break;
//                     case "-":
//                         result = first - second;
//                         break;
//                     case "*":
//                         result = first * second;
//                         break;
//                     case "/":
//                         result = first / second;
//                         break;
//                     case "^":
//                         result = (int) Math.pow(first, second);
//                         break;
//                 }
//                 st.push(result);
//             } else {
//                 st.push(Integer.parseInt(token));
//             }
//         }
//         return st.peek();
//     }

//     boolean isOperator(String s) {
//         return s.equals("^") || s.equals("+") || s.equals("*") || s.equals("/") || s.equals("-");
//     }
// }



 class Solution {
  

    public int evalPostfix(String[] A) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (isOperator(A[i])) {
                int n2 = st.pop();
                int n1 = st.pop();
                String ch = A[i];
                switch (ch) {
                    case "+":
                        st.push(n2 + n1);
                        break;
                    case "-":
                        st.push(n1 - n2); 
                        break;
                    case "*":
                        st.push(n1 * n2);
                        break;
                    case "/":
                        st.push(n1 / n2); 
                        break;
                }
            } else {
                int n = Integer.parseInt(A[i]);
                st.push(n);
            }
        }
        return st.pop();
    }
      public boolean isOperator(String op) {
       
        if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")) {
            return true;
        } else {
            return false;
        }
    }
    public char[] removeKdigits(String a, int i) {
        return null;
    }
}