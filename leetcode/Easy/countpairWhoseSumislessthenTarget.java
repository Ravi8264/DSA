import java.util.*;

public class countpairWhoseSumislessthenTarget {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>(List.of(-1, 1, 2, 3, 1));
        int target = 2;
        System.out.println(new Solution().countPairs(ans, target));

    }
}

// class Solution {
// public int countPairs(List<Integer> nums, int target) {

// int n = nums.size();
// Collections.sort(nums);
// int i = 0, count = 0;
// while (i < n) {

// for (int j = i + 1; j < nums.size(); j++) {
// if (nums.get(i) + nums.get(j) < target)
// ++count;
// }
// ++i;
// }
// return count;
// }
// }

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;
        Collections.sort(nums);
        while (left <= right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                ++left;
            } else
                --right;
        }

        return count;
    }
}