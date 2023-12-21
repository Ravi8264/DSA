import java.util.*;

public class minimum_difference {
    public static void main(String[] args) {
        int a[] = { 12, 9, 8, 2, 11 };
        System.out.println(new Solution().minimumAbsDifference(a));
    }

}

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> pair = new ArrayList<>();
        int[] c = arr.clone();
        Arrays.sort(c);
        int min = 9999;
        for (int i = 1; i < c.length; i++) {
            int diff = c[i] - c[i - 1];
            if (diff < min) {
                min = diff;
                pair.clear();
            }
            if (min == diff) {
                List<Integer> ans = new ArrayList<>();
                ans.add(c[i - 1]);
                ans.add(c[i]);
                pair.add(ans);
            }
        }
        return pair;
    }
}