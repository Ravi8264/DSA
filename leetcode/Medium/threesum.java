import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(new Solution().threeSum(nums));
    }

}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeVal = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length-2; i++) {
           if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int val = nums[i] + nums[j] + nums[k];
                if (val == 0) {
                    threeVal.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while ( j < k && nums[j] == nums[j + 1] )
                        j++;
                    while ( j < k && nums[k] == nums[k - 1] )
                        k--;
                   k--;j++;    
                } else {
                    if (val >= 0)
                        k--;
                    else
                        j++;
                }

            }
        }
        return threeVal;
    }
}

// class Solution {
// public List<List<Integer>> threeSum(int[] nums) {

// List<List<Integer>> threeVal = new ArrayList<>();
// int length = nums.length;
// Arrays.sort(nums);
// int b[] = new int[0];
// int l = 0;
// for (int i = 0; i < nums.length - 2; i++) {
// if (nums[i] == 0 && nums[i + 1] == 0 && nums[i + 2] == 0) {
// b = Arrays.copyOf(b, b.length + 3);
// b[b.length - 1] = nums[i];
// b[b.length - 2] = nums[i];
// b[b.length - 3] = nums[i];
// } else {
// if (b.length != 0 && b[b.length - 1] == nums[i + 1]) {
// continue;
// } else {
// b = Arrays.copyOf(b, b.length + 1);
// b[b.length - 1] = nums[i];
// }
// }
// }

// if (b[b.length - 1] != nums[nums.length - 2]) {
// b = Arrays.copyOf(b, b.length + 1);
// b[b.length - 1] = nums[nums.length - 2];
// }
// if (b[b.length - 1] != nums[nums.length - 1]) {
// b = Arrays.copyOf(b, b.length + 1);
// b[b.length - 1] = nums[nums.length - 1];
// }

// for (int i = 0; i < b.length; i++) {
// int j = i + 1, k = b.length - 1;
// j = i + 1;
// while (j < k) {
// List<Integer> st = new ArrayList<>();
// int val = b[i] + b[j] + b[k];
// if (val == 0) {
// st.add(b[i]);
// st.add(b[j]);
// st.add(b[k]);
// }
// if (threeVal.size() > 0 && !threeVal.contains(st) && st.size() == 3) {
// threeVal.add(st);
// } else {

// if (st.size() == 3 && threeVal.size() == 0) {
// threeVal.add(st);

// }
// }
// if (val > 0)
// k--;
// else
// j++;

// }

// }

// return threeVal;
// }
// }

// class Solution {
// public List<List<Integer>> threeSum(int[] nums) {
// List<List<Integer>> ans = new ArrayList<>();

// int n = nums.length;
// for (int i = 0; i < n; i++) {
// for (int j = i + 1; j < n; j++) {
// for (int k = j + 1; k < n; k++) {
// List<Integer> threeVal = new ArrayList<>();
// if (nums[i] + nums[j] + nums[k] == 0) {
// threeVal.add(nums[i]);
// threeVal.add(nums[j]);
// threeVal.add(nums[k]);
// Collections.sort(threeVal);
// if (ans.size() == 0)
// ans.add(threeVal);
// else {
// if (!ans.contains(threeVal)) {
// ans.add(threeVal);
// }
// }
// }
// }
// }
// }

// return ans;

// }
// }
