import java.util.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class maximumSlidingWindows {
    public static void main(String[] args) {
        int a[] = {12 ,72 ,7, -35 ,13 ,31, 61 ,38 ,3 };
        System.out.println(new Solution().maxSlidingWindow(a, 7));
    }

}





class Solution {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result.add(nums[deque.peek()]);
            }
        }

        return result;
    }
}
