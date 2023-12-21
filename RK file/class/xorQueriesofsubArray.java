import java.util.Arrays;

public class xorQueriesofsubArray {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 8 };
        xorQueries(a, 0, 3);

    }

    static void xorQueries(int a[], int l, int r) {
        int xor[] = new int[a.length];
        xor[0]=a[0];
        int n = a.length;
        for (int i = 1; i < n; i++) {
            xor[i] = xor[i-1] ^ a[i];
        }
        System.out.println(Arrays.toString(xor));
        int left=l==0?0:xor[l-1];
        int right=xor[r];
        System.out.println(left^right);
    }
}
