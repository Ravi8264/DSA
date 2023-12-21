import java.util.Arrays;

public class WineBuyingandSelling {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8 };
        System.out.println(wineSelling(arr, 4));
    }

    static long wineSelling(int a[], int n) {
        long ans = 0;

        Arrays.sort(a);
        int val[] = new int[n];
        int j = 0, p = n - 1;
        for (int i = 0; i < n; i += 2) {
            val[i] = a[j++];
            val[i + 1] = a[p--];
        }

        for (int i = 1; i < n; i++) {
            ans += Math.abs(val[i] - val[i - 1]);
        }
        ans += Math.abs(val[n - 1] - val[0]);
       
        return ans;
    }
}
