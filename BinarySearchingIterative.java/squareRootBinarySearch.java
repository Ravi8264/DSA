public class squareRootBinarySearch {
    public static void main(String[] args) {
        System.out.println(squareRoot(100));
    }

    static int squareRoot(int a) {
        int l = 1, r = a, ans = -1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (m * m == a)
                return m;
            if (m * m > a) {
                r = m - 1;
            } else {
                ans = m;
                l = m + 1;
            }
        }
        return ans;

    }


    

}
