import java.util.Arrays;
import java.util.*;
public class CountSubarraysWithMedianK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(countSubarrays(a, k));
    }
    public static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0, sum = 0;
        boolean flag = false;
        for (int i : nums) {
            if (i < k)
                --sum;
            else if (i > k)
                ++sum;
            else {
                flag = true;
            }
            if (flag) {
                ans += map.getOrDefault(sum, 0) + map.getOrDefault(sum - 1, 0);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return ans;
    }

}
