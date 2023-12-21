import java.util.Scanner;

public class maxStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(maxStacks(n));
    }

    public static int maxStacks(int N) {
        int l = 0;
        int h = N;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long val = ((long) mid * (mid + 1)) / 2;
            if (val > N) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return h;

    }

}
