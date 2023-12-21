import java.util.*;

public class DifferentSumBitsPairwise {
    public static void main(String[] args) {

        int A[] = { 1,3,5 };
        System.out.println(new Solution().cntBits(A));
    }

}

class Solution {
    public int cntBits(int[] A) {

        int n = A.length, count = 0;
        for (int i = 0; i < n; i++) {
            String m = bits(A[i]);
            for (int j = 0; j < n; j++) {
                String v = bits(A[j]);
                count += checkVal(m, v);
            }
        }
        return count;
    }
    private int checkVal(String a, String b) {
        if (a.equals(b))
            return 0;
        StringBuilder p = new StringBuilder(a);
        StringBuilder q = new StringBuilder(b);
        p.reverse();
        q.reverse();
        int i = 0;
        int count = 0, max = Math.max(a.length(), b.length());
        while ( max > i) {
            if (q.length()==0)
                q.append("0");
            if (p.isEmpty())
                p.append("0");
            if (p.charAt(0) != q.charAt(0)) {
                ++count;
            }
            q = q.deleteCharAt(0);
            p = p.deleteCharAt(0);
            i++;
        }
        return count;
    }

    String bits(int a) {
        String c = "";
        while (a != 0) {
            if ((a & 1) == 1)
                c = 1 + c;
            else
                c = '0' + c;
            a = a >> 1;
        }
        return c;
    }
}
