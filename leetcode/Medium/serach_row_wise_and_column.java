import java.util.*;

public class serach_row_wise_and_column {

    public static void main(String[] args) {
        

    }

    public static int[] findElement(int[][] mat, int x) {

        int n = mat.length;
        int j = mat[0].length;
        int i = 0;
        int ans[] = new int[2];
        Arrays.fill(ans, -1);
        while (i <= n && j >= 0) {
            int check_val = mat[i][j];
            if (check_val == x) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if(check_val>x){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
