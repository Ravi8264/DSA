public class pivotindex {
    public static void main(String[] args) {

    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int i = 1, index = 0, k = 2;
        int n = nums.length - 2;
        int left_sum = 0, right_sum = 0;
        left_sum += nums[i];
        right_sum += nums[n - 1];
        while (i < n) {
            if (left_sum == right_sum && k == nums.length) {

            }
            if (left_sum < right_sum) {
                left_sum += nums[i];
                ++i;
            } else {
                right_sum += nums[n];
                --n;
            }
            ++k;

        }
        return 0;
    }
}