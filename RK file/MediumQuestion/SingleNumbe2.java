import java.util.Arrays;

public class SingleNumbe2 {
    public static void main(String[] args) {
        int nums[] = { 30000, 500, 100, 30000, 100, 30000, 100 };
        System.out.println(new Solution().singleNumber(nums));

    }
}

// class Solution {
// public int singleNumber(int[] nums) {

// for (int i = 0; i < nums.length; i++) {
// boolean flag = false;
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[i] == 0) {
// j = nums.length;
// } else if (nums[i] == nums[j]) {
// nums[j] = nums[i] ^ nums[j];
// flag = true;
// }

// }
// if (flag) {
// nums[i] = 0;
// }
// }
// int ans = 0;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] != 0) {
// ans = nums[i];
// break;
// }

// }
// return ans;

// }
// }

// class Solution {
// public int singleNumber(int[] nums) {
// int ans = 0;

// for (int i = 0; i < 32; ++i) {
// int sum = 0;
// for ( int num : nums)
// sum += num >> i & 1;
// sum %= 3;
// ans |= sum << i;
// }

// return ans;
// }
// }
//2, 2, 2, 98

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < n; i = i + 3) {
            if ((nums[i - 1] ^ nums[i]) == 0) {
                continue;
            } else {
                return nums[i-1];
            }
        }
        return nums[n-1];
    }
}