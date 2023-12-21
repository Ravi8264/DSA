public class IntegerReplacement {
    public static void main(String[] args) {
        System.out.println(integerReplacement(7));

    }

    public static int integerReplacement(int N) {
        // int cnt = 0;
        // while (N > 1) {
        // if (N % 2 != 0) {
        // N = Math.min(integerReplacement(N + 1)+1, integerReplacement(N - 1)+1);

        // } else {
        // N /= 2;
        // }
        // ++cnt;
        // }
        // return cnt;

        // }
        if (N == 1) {
            return 0;

        }
        if (N == Integer.MAX_VALUE)
            return 32;
        if (N % 2 == 0)
            return integerReplacement(N / 2) + 1;
        else {
            return Math.min(integerReplacement(N-1) + 1, integerReplacement(N + 1) + 1);
        }
    }
    //  public int integerReplacement(int N) {
    //     int steps = 0;
    //     long n = (long) N;
    //     while (n != 1) {
    //         if(n % 2 == 0) {
    //             n = n / 2;
    //         } else {
    //             long left = (n - 1) / 2;
    //             if(left == 1 || left % 2 == 0) {
    //                 n = n - 1;
    //             } else {
    //                 n = n + 1;
    //             }
    //         }
    //         steps++;
    //     }
        
    //     return steps;

    // }
}

}
