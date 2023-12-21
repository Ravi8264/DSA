import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Canddy {
    public static void main(String[] args) {
        int a[] = { 12, 1, 12 };
        int extraCandies = 10;
        System.out.println(new Solution().kidsWithCandies(a, extraCandies));
    }

}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int b[] = candies;

        List<Boolean> st = new ArrayList<>();

        int max = findMAx(candies, 0, candies.length);
        int count = 0;
        for (Integer i : candies) {
            // boolean ans=i + extraCandies >= max?true:false;
            // st.add(ans);
            st.add((i+extraCandies)>=max);
        }
        return st;
    }

    int findMAx(int[] a, int i, int n) {
        if (i == n - 1) {
            return a[i];
        }
        int rec = findMAx(a, i + 1, n);
        return Math.max(a[i], rec);

    }
}