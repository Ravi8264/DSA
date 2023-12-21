public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {

        int sine = 1;
        long ans = 1;
        if (x < 0) {
            x = -x;
            sine = -1;
        }
        String s = "";
        s += x;

        for (int i = 1; i < s.length(); i++)
            ans *= 10;
        System.out.println(ans);

        long result = 0;
        while (x > 0) {
            long a = (x % 10) * ans;
            result += a;
           
            ans = ans / 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE)
            return 0;
        return (int) result * sine;
    }
}
