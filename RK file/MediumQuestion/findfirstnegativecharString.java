import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class findfirstnegativecharString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(new Solution().FirstNonRepeating(s));
    }

}

// class Solution {

// public static String FirstNonRepeating(String A) {
// Queue<Character> q = new LinkedList<>();
// int n = A.length();
// q.add(A.charAt(0));
// String a = "";
// a += A.charAt(0);
// for (int i = 1; i < n; i++) {
// char c = A.charAt(i);
// if (!q.isEmpty() && q.peek() == c) {
// q.poll();
// } else if (q.isEmpty()) {
// a += '#';
// }
// a += q.peek();
// System.out.println(c);
// q.add(c);
// }
// return a;

// }
// }
// abacbcbd



class Solution {
    public static String FirstNonRepeating(String A) {
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        int[] index = new int[26];
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            int val = c - 'a';
            index[val] = index[val] + 1;
            q.add(c);
            while (!q.isEmpty() && index[q.peek() - 'a'] > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                result.append('#');
            } else {
                result.append(q.peek());
            }
        }

        return result.toString();
    }
}