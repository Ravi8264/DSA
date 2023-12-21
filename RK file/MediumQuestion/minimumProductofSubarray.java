public class minimumProductofSubarray {

    static int minProductSubset(int a[], int n) {
        if (n == 1)
            return a[0];

        int negMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int cnt_zero = 0, cnt_neg = 0;
        int mult = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                ++cnt_zero;
                continue;
            }
            if (a[i] < 0) {
                ++cnt_neg;
                negMax = Math.max(negMax, a[i]);
            }
            if (a[i] > 0 && a[i] < min) {
                min = Math.min(min, a[i]);
            }
            mult *= a[i];
        }
        if (n == cnt_zero || (cnt_neg == 0 && cnt_zero > 0))
            return 0;
        if (cnt_neg == 0) {
            return min;
        }
        if (cnt_neg % 2 == 0 && cnt_neg != 0)
            mult /= negMax;
        return mult;

    }

    public static void main(String[] args) {

        int a[] = { -4, 7, 7, -5, -2, 4, 8, -6, 7, 10 };
        int n = 10;

        System.out.println(minProductSubset(a, n));
    }
}

