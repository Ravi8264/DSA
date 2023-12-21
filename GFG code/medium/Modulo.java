
public class Modulo {
    public static void main(String[] args) {
        long a = 2;
        long b = 3;
        int c = 4;

        System.out.println(new Solution().PowMod(a,b, c));

    }

}

class Solution {
    public long PowMod(long x, long y, long p) {
        long res = 1;

        x = x % p;

        if (x == 0)
            return 0;

        while (y > 0) {

            if ((y & 1) != 0) {
                res = (res * x) % p;
                System.out.println(res);
            }

            y = y >> 1; 
            x = (x * x) % p;
        }
        return res;

    }
}




