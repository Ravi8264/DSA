import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximum_Absolute_Difference {
    public static void main(String[] args) {
        List<Integer> st = List.of(1, 3, -1);
        System.out.println(new Solution().maxArr(new ArrayList<>(st)));

    }

}

class Solution {
    public int maxArr(ArrayList<Integer> A) {
        // int a[] = new int[A.size()];
        // int b[] = new int[A.size()];
        // ;
        // int c[] = new int[A.size()];
        // ;
        // int d[] = new int[A.size()];
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;
        int min1, min2;
        min1 = min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            // a[i] = A.get(i) + i - (A.get(i) + i);
            // b[i] = (A.get(i) - i) - (A.get(i) - i);
            // c[i] = A.get(i) - i - (A.get(i) - i);
            // d[i] = A.get(i) + i - (A.get(i) + i);
            max1 = Math.max(max1, A.get(i) + i);
            min1 = Math.min(min1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min2 = Math.min(min2, A.get(i) - i);

        }

        return Math.max(max1 - min1, max2 - min2);

    }
}