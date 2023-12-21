import java.util.Arrays;

public class AgrgresiveCowsProblem {
    public static void main(String[] args) {
        int a[]={1,2,4,8,9};
        int k=3;
        System.out.println(AgrgresiveCows(a, k));

    }

    static int AgrgresiveCows(int a[], int k) {
        int l = 0, h =a[a.length-1];
        int ans = -1;
        Arrays.sort(a);
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (isPossible(a, k, m)) {
                ans = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int a[], int k, int dis) {
        int count = 1;
        int prev = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] - prev >= dis) {
                count++;
                prev = a[i];
            }
        }
        return count >= k;
    }

}
