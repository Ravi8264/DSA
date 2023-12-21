public class papercutMinimumNumber {
    public static void main(String[] args) {
        System.out.println(minCut(9, 15));

    }

    public static int minCut(int M, int N) {
        if (M < N) {
            int temp = M;
            M = N;
            N = temp;
        }
        int a = M;
        int b = N;
        int result = 0;
        while (a > 0) {
            int c = a;
            int rem = b % a;
            result += b / a;
            a = rem;
            b = c;
        }
        return result;
    }

}
