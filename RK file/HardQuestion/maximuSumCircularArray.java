import java.util.Arrays;

public class maximuSumCircularArray {
    public static void main(String[] args) {
        int nums[] = { -5, -3, -5 };
        System.out.println(new Solution().maxSubarraySumCircular(nums));
    }

}

class Solution {
    public int maxSubarraySumCircular(int[] a) {
        int n = a.length;
        int max = 0;
        int b[] = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            b[i] = a[i % n];
        }
        // System.out.println(Arrays.toString(b));
        boolean flag = true;
        int ans = -99999;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                ans = Math.max(a[i], ans);
                continue;
            } else {
                flag = false;
            }

        }
        System.out.println(flag+" "+ans);
        if (flag )
            return ans;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < i + n; j++) {
                sum += b[j];
                if (sum < 0) {
                    sum = 0;
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;

    }
}

// class Solution {
// public int maxSubarraySumCircular(int[] a) {
// int max_sum = Integer.MIN_VALUE;
// int total = 0;
// int temp_Max = 0;
// int min_Sum = Integer.MAX_VALUE;
// int temp_min = 0;
// for (int i = 0; i < a.length; i++) {
// total += a[i];
// temp_Max+=a[i];
// max_sum = Math.max(temp_Max, max_sum);
// if (temp_Max < 0)
// temp_Max = 0;
// temp_min+=a[i];
// min_Sum = Math.min(temp_min,min_Sum );
// if (temp_min > 0) {
// temp_min = 0;
// }
// }
// if(total==min_Sum) return max_sum;
// return Math.max(max_sum, total-min_Sum);
// }
// }