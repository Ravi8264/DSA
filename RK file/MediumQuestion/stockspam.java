import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class stockspam {
    public static void main(String[] args) {
        int a[] = { 100, 80, 60, 70, 60, 75, 85 };
        //int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(new Solution().calculateSpan(a, a.length)));
    }

}

class Solution {
    public static int[] calculateSpan(int price[], int n) {
        int ans[] = new int[n];
        ans[0] = 1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.add(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (price[top] > price[i]) {
                    break;
                } else {
                    stack.pop(); 
                }
            }
            if (stack.isEmpty()) {
                ans[i] = i+1;
            } else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}