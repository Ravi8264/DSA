public class trailingzerofactorial {
    public static void main(String[] args) {
        int a =25;
        System.out.println(new Solution().trailingZeroes(a));

    }
}

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 5) {
            if (i > 1)
                count += n / i;
        }

        return count;
    }
}