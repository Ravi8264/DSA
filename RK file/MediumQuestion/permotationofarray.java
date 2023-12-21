import java.util.*;

public class permotationofarray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        System.out.println(new Solution().permute(a));
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums, 0, nums.length-1);

        return ans;

    }

    void permutation(int nums[], int l, int r) {
        if (l == r) {
            for(int i=0; i<nums.length; i++){
                System.out.print(nums[i]);
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(nums, i, l);
            permutation(nums, l+1, r);
            swap(nums, i, l);
        }

    }

    void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }
}