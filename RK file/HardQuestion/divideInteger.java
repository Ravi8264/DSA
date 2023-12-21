import java.util.Scanner;

public class divideInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(new Solution().divide(a, b));
    }

}

// class Solution {
// public int divide(int dividend, int divisor) {
// long a = dividend;
// long b = divisor;
// if (dividend == Integer.MIN_VALUE && divisor == -1)
// return Integer.MAX_VALUE;
// int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
// if (a < 0)
// a = -a;
// if (b < 0)
// b = -b;

// int count_quotient = 0;
// while (a >= b) {
// a -= b;
// ++count_quotient;
// }
// if (sign == -1)
// count_quotient = -count_quotient;

// return count_quotient;
// }
// }

class Solution {
    public int divide(int dividend, int divisor) {
        long a = dividend;
        long b = divisor;
        if ((int) b == -1 && (int) a == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;

        int result = 0;
        while (a >= b) {
            long temp = b;
            long multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;

        }
        if (sign == -1)
            result = -result;

        return result;
    }
}