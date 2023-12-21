import java.util.*;

public class continueous_subArray {
    public static void main(String[] args) {
        // int nums[] = { 65, 66, 67, 66, 66, 65, 64, 65, 65, 64 };
        int nums[] = { 1, 2, 3 };
        System.out.println(new Solution().continuousSubarrays(nums));
    }
}

// class Solution {
// public long continuousSubarrays(int[] nums) {
// long ans = nums.length;
// int n = nums.length;
// int val = 2;
// int count = 0;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n - val + 1; j++) {
// int c = 0;
// int p = j;
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for (int k = j; k < j + val; k++) {
// //System.out.print(nums[k] + " ");
// ++c;
// max = Math.max(max, nums[k]);
// min = Math.min(min, nums[k]);
// if (k > j && Math.abs(nums[k] - nums[p++]) > 2) {
// k = j + val;
// } else {
// int check=max-min;
// if (c == val && check>=0 && check<=2) {
// ++count;
// }
// }
// }
// }
// ++val;
// }
// return ans + count;
// }
// }

// class Solution {
// public long continuousSubarrays(int[] nums) {
// long ans = nums.length;
// int n = nums.length;
// int val = 2;
// int count = 0;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n - val + 1; j++) {
// int c = 0;
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for (int k = j; k < j + val; k++) {
// ++c;
// max = Math.max(max, nums[k]);
// min = Math.min(min, nums[k]);
// int check = max - min;
// if (c == val && check >= 0 && check <= 2) {
// ++count;
// }
// }
// }
// ++val;
// }
// return ans + count;
// }
// }

class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans = nums.length;
        int n = nums.length;
        int val = 2;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - val + 1; j++) {
                int c = 0;
                for (int k = j; k < j + val; k++) {
                    ++c;
                    if (Math.abs(nums[k] - nums[j]) >= 0 &&  Math.abs(nums[k] - nums[j]) <= 2 && c == val) {
                        ++count;
                    } else if (Math.abs(nums[j] - nums[k]) > 2)
                        k = j + val;
                }
            }
            ++val;
        }

        return ans + count;
    }
}