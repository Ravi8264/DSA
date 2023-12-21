import java.util.*;

public class maximumofminimumwindows {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int b[] = new Solution().maxOfMin(a, a.length);
        for (int i : b) {
            System.out.print(i + " ");
        }
    } 
}



class Solution {
    public static int[] maxOfMin(int[] arr, int n) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int ans[] = new int[n];
        int left[] = prevSmaller(arr);
        int right[] = rightSmaller(arr);
        Arrays.fill(ans, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            int wl = right[i] - left[i] - 1;
            ans[wl - 1] = Math.max(ans[wl - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }
        return ans;
    }
    public static int[] prevSmaller(int[] A) {
        int c[] = new int[A.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < A.length; i++) {
            while (!st.isEmpty() && A[i] <= A[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                c[i] = -1;
            } else {
                c[i] = st.peek();
            }
            st.push(i);
        }
        return c;
    }
    public static int[] rightSmaller(int[] A) {
        int c[] = new int[A.length];
        int n = A.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[i] <= A[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                c[i] = n;
            } else {
                c[i] = st.peek();
            }
            st.push(i);
        }
        return c;
    }
}