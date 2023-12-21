import java.util.*;

public class sortedUnsortedContineous {
    public static void main(String[] args) {
        int[] nums = { 1, 4,2,3, 5 };
        System.out.println(new Solution().findUnsortedSubarray(nums));

    }

}

// class Solution {
// public int findUnsortedSubarray(int[] nums) {

// int n = nums.length, j = 0;
// int b[] = new int[n], count = 0;
// for (int i : nums)
// b[j++] = i;

// Arrays.sort(b);
// int start = 0, end = n - 1;
// while (start < n && b[start] == nums[start]) {
// start++;
// }
// while (end > start && b[end] == nums[end]) {
// end--;
// }
// return end - start + 1;
// }
// }

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int start = -1, end = -2;
        int min = nums[n - 1], max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) {
                end = i;
            }
            if (nums[n - 1 - i] > min) {
                System.out.println(min);
                start = n - 1 - i;
            }
        }

        return end - start + 1;
    }
}

// class Solution {
// public int findUnsortedSubarray(int[] nums) {
// int n = nums.length;
// int start = -1, end = -2;
// Stack<Integer> max = new Stack<>();
// Stack<Integer> min = new Stack<>();
// min.push(n - 1);
// max.push(0);
// for (int i = 1; i < n; i++) {
// if (nums[max.peek()] < nums[i]) {
// max.pop();
// max.push(i);
// }
// if (nums[min.peek()] > nums[n - 1 - i]) {
// min.pop();
// min.push(n - 1 - i);
// }
// if (nums[i] < nums[max.peek()]) {
// end = i;
// }
// if (nums[n - 1 - i] > nums[min.peek()]) {
// start = n - 1 - i;
// }
// }

// return end - start + 1;
// }
// }