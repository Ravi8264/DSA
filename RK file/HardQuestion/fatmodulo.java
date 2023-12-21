import java.util.*;

class fastpowermodulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 2;
        int n = -2;
        int p = 500;
        System.out.println(new Solution().myPow(x, n, p));
    }
}

class Solution {
    public double myPow(double x, int n, int p) {
        double ans = 0;
        if (n <= 0) {
            ans = modPow(1/x, n, p);
        } else {
            ans = modPow(x, n, p);
        }
        return ans;
    }

    public double modPow(double x, int n, int p) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        return ((x % p) * (myPow(x, n - 1, p)) % p) % p;
    }
}
