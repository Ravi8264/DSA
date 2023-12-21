import java.util.Arrays;

public class LeftandRightSum {
    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(new Solution().leftRightDifference(nums)));

    }

}

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        left[0] = 0;
        right[nums.length - 1] = 0;
        if (nums.length == 1)
            return left;
        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.abs(nums[i - 1] + left[i - 1]);
            right[nums.length - i - 1] = Math.abs(nums[nums.length - i] + right[nums.length - i]);
        }
        for(int j=0; j<nums.length; j++){
            nums[j]=Math.abs(left[j]-right[j]);
        }

        return nums;
    }
}

// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//             int left_sum[] = new int[nums.length];
//         int right_sum[] = new int[nums.length];

//         for(int i=1; i<nums.length; i++){
//             left_sum[i] = left_sum[i-1] + nums[i-1];
//         }

//         for(int i=nums.length - 2; i>=0; i--){
//             right_sum[i] = right_sum[i+1] + nums[i+1];
//         }

//         for(int i=0; i<nums.length; i++){
//             nums[i] = Math.abs(left_sum[i] - right_sum[i]);
//         }
//         return nums;
//     }
// }