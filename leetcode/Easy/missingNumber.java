import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        int a[] = { 3, 4, -1, 1 };
        System.out.println(new Solution().missingNumber(a));

    }

}

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<Integer> hm = new HashSet<>();
        for (int i = nums[0]; i < nums[0] + n; i++) {
            hm.add(i);
        }
        for (Integer i : nums) {
            if (hm.contains(i)) {
                hm.remove(i);
            }
        }
        if (hm.isEmpty()) {
            return nums[n - 1] + 1;
        }
        for (Integer missing : hm) {
            if(missing==0)continue;
            return missing;
        }
        return 0;

    }
}