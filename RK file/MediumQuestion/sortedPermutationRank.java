import java.util.ArrayList;
import java.util.*;

public class sortedPermutationRank {
    public static void main(String[] args) {
        String a = "zyxwvutsrqponmlkjihgfedcba";
        // abcde
        System.out.println(new Solution().findRank(a));

    }

}

// class Solution {

// public static int findRank(String A) {
// ArrayList<String> st = new ArrayList<>();
// // String backup=new String(A);
// // System.out.println(backup);

// backtraking(A, st, 0, A.length() - 1);
// Collections.sort(st);
// return st.indexOf(A) + 1;
// }

// static void backtraking(String A, ArrayList<String> st, int l, int r) {
// if (l == r && !st.contains(A)) {
// st.add(A);
// return;
// }
// for (int i = l; i <= r; i++) {
// A = swap(A, i, l);
// backtraking(A, st, l + 1, r);
// A = swap(A, i, l);
// }
// }

// static String swap(String str, int i, int j) {
// char ch[] = str.toCharArray();
// char temp = ch[i];
// ch[i] = ch[j];
// ch[j] = temp;
// return String.valueOf(ch);
// }

// }

// class Solution {
//     static int mod=1000003;
//     public static int findRank(String A) {
//         int idx = 0;
//         char c[] = A.toCharArray();
//         Arrays.sort(c);
//         String ans = "";

//         for (Character i : c) {
//             ans += i;
//         }
//         boolean taken[] = new boolean[A.length()];
//        int result = 0;
//         for (int i = 0; i < A.length(); i++) {
//             if (taken[i])
//                 continue;
//             else if (ans.charAt(i) != A.charAt(idx)) {
//                 result= (result+factorial(A.length() - idx - 1))%mod;

//             } else {
//                 taken[i] = true;
//                 idx++;
//                 i=-1;
//             }

//         }
//         return result+1%mod;

//     }

//     static int factorial(int f) {
//         if (f == 1 || f == 0)
//             return 1;
//         int ans = 1;
//         for (int i = 2; i <= f; i++) {
//             ans= ans*i%mod;
//         }
//         return ans%mod;
//     }
// }


class Solution {
    static int mod=1000003;
    public static int findRank(String A) {
        int idx = 0;
        char c[] = A.toCharArray();
        Arrays.sort(c);
        String ans = "";
        for (Character i : c) {
            ans += i;
        }
        boolean taken[] = new boolean[A.length()];
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            if (taken[i])
                continue;
            else if (ans.charAt(i) != A.charAt(idx)) {
                result = (result+factorial(A.length() - idx - 1))%mod;
              
            } else {
                taken[i] = true;
                idx++;
                i=-1;

            }

        }
        return result+1%mod;

    }

    static int factorial(int f) {
        if (f == 1 || f == 0)
            return 1;
        int ans = 1;
        for (int i = 2; i <= f; i++) {
            ans = (ans*i)%mod;
        }
        return ans%mod;
    }
}