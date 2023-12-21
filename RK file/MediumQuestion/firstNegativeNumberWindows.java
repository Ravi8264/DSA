import java.util.*;

class firstNegativeNumberWindows {
    public static void main(String[] args) {
        int arr[] = { -8, 2, 3, -6, -10 };
        Solution solution = new Solution();
        System.out.println(solution.firstNegative(arr, arr.length, 2));
    }
}

class Solution {
    public List<Integer> firstNegative(int[] arr, int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            if (arr[i] < 0) {
                q.offer(i);
            }
            if (i >= k - 1) {
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[q.peek()]);
                }
            }
        }

        return result;
    }
}
