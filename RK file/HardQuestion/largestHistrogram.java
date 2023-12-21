import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class largestHistrogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(new Solution().largestRectangleArea(a));
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prevSmallerHeight = previousmin(heights);
        int[] nextSmallerHeight = nextmin(heights);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int area = (nextSmallerHeight[i] - prevSmallerHeight[i] - 1) * heights[i];
            ans = Math.max(ans, area);
        }
        return ans;
    }
    int[] previousmin(int[] heights) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int prev[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }
            st.push(i);
        }
        return prev;
    }
    int[] nextmin(int[] heights) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        int prev[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                prev[i] = n;
            } else {
                prev[i] = st.peek();
            }
            st.push(i);
        }
        return prev;
    }
}