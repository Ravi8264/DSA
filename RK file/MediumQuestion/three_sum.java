import java.util.*;

class three_sum {

    public static void main(String[] args) {
        int a[] = { -4, -2, -2, 0, 4 };
        List<List<Integer>> st = threeSum(a);
        System.out.println(st);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int val = nums[i] + nums[left] + nums[right];
                if (val == 0) {
                    List<Integer> st = List.of(nums[i], nums[left], nums[right]);
                    ans.add(st);
                    --right;
                } else if (val > 0) {
                    --right;
                }

                else
                    ++left;

            }
        }

        return new ArrayList<>(ans);
    }

    // public static List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> ans = new ArrayList<>();
    // int n = nums.length;
    // Arrays.sort(nums);
    // for (int i = 0; i < n - 2; i++) {
    // if(i>0 && nums[i]==nums[i-1])continue;
    // int left = i + 1;
    // int right = nums.length - 1;
    // while (left < right) {
    // int val = nums[i] + nums[left] + nums[right];
    // if (val == 0) {
    // List<Integer> st = List.of(nums[i], nums[left], nums[right]);
    // ans.add(st);
    // --right;
    // } else if (val > 0) {
    // --right;
    // }

    // else
    // ++left;

    // }
    // }

    // return ans;
    // }

}
