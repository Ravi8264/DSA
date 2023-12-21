import java.util.*;

public class NearestSmallerElement {
    public static void main(String[] args) {
        // List<Integer> st = List.of(1, 2,3,4,3,2,1);

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer> st = new ArrayList<>();
        while (n > 0) {
            int t = scn.nextInt();
            st.add(t);
            n--;
        }
        System.out.println(new Solution().prevSmaller(new ArrayList<>(st)));
    }

}

class Solution {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < A.size(); i++) {
            while (!st.isEmpty() && A.get(i) <= A.get(st.peek())) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                // System.out.println(st);
                // System.out.println(A.get(st.peek()));
                ans.add(A.get(st.peek()));
            }
            st.push(i);
        }
        return ans;
    }
}

// class Solution {
// public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
// ArrayList<Integer> ans = new ArrayList<>();
// ArrayDeque<Integer> st = new ArrayDeque<>();
// int n = A.size();
// for (int i = n - 1; i >= 0; i--) {
// while (!st.isEmpty() && A.get(i) <= A.get(st.peek())) {
// st.pop();
// }
// if (st.isEmpty()) {
// ans.add(0, n);
// } else {
// ans.add(0, st.peek());
// }
// st.push(i);
// }
// return ans;
// }
// }