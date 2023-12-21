import java.util.*;

public class HighestProduct {
    public static void main(String[] args) {
        int nums[]={-100,-2,-3,1};
        System.out.println(maximumProduct(nums));

    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        int cntNegative = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0)
                cntNegative++;
        }
        if (cntNegative % 2 == 0 && cntNegative > 0) {
            for (int i = 0; i < n; i++) {
                nums[i] = Math.abs(nums[i]);
            }
        } else {
            int i = 0;
            while (cntNegative > 1) {
                nums[i] = Math.abs(nums[i]);
                i++;
                --cntNegative;
            }
        }
        Arrays.sort(nums);
        int k = 0;
        while (k < n - 3) {
            k++;
        }
        int product = 1;
        while (k < n) {
            product *= nums[k];
            k++;
        }
        return product;
    }

}
