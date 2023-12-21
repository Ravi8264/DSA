import java.util.Arrays;

public class xor {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 11 };
        int[][] Queries = { { 0, 2 }, { 1, 3 } };
        System.out.println(Arrays.toString(new Solution().xorQueries(arr, Queries)));
    }

}

class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int xor[] = new int[arr.length];

        xor[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i];
        }
        int ans[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0] == 0 ? 0 : xor[i - 1];
            int right = xor[queries[i][1]];
            ans[i]=left^right;
        }
    

        return ans;
    }
}