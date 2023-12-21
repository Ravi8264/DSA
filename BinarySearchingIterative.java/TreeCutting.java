import java.util.Arrays;

public class TreeCutting {
    public static void main(String[] args) {
        int a[] = { 5, 5, 1, 5, 1, 5, 1, 6, 6, 6 };
        int k = 3;
        System.out.println(woodCutter(a.length,a,k));

    }

    static int woodCutter(int N,int A[], int M) {
        int ans = -1;
        Arrays.sort(A);
        int l = A[0], h = A[N - 1];
        while (l < h) {
            int m = l + (h - l) / 2;
            int totalWoodlength = getWoodCut(A, m);
            if (totalWoodlength == M)
                return m;
            if (totalWoodlength > M) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }

    static int getWoodCut(int a[], int cut) {
        int ans = 0;
        for (int e : a) {
            ans += e > cut ? e - cut : 0;
        }
        return ans;
    }
}
