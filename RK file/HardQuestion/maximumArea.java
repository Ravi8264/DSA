import java.util.Arrays;
import java.util.Stack;

public class maximumArea {
    public static void main(String[] args) {
        char matrix[][] = { { '1', '1', '0' },
                            { '1', '1', '0',  }}; 
                            // { '1', '1', '0', '1' }, 
                            // { '1', '1', '1', '1' } };
        new Solution().maximalRectangle(matrix);
    }

}

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int area = area(matrix[0]);
        System.out.println(area);
        char currRow[] = matrix[0];
       
        int n = matrix.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char c = matrix[i][j];
                if (c == '1') {
                    int a = currRow[j] - '0';
                    int b = matrix[i][j] - '0';
                    char p = (char) (a+b + '0');
                    currRow[j]=p;
                } else {
                    currRow[j] = '0';
                }
            }
            System.out.println(Arrays.toString(currRow));
            area = Math.max(area, area(currRow));
        }
        System.out.println(area);
        return area;
    }

    int area(char a[]) {
        int[] leftmin = leftmin(a, a.length);
        // System.out.println(Arrays.toString(leftmin));
        int rightmin[] = rightmin(a, a.length);
        // System.out.println(Arrays.toString(rightmin));
        int Area = 0, n = a.length;
        for (int i = 0; i < n; i++) {
            int val = a[i] - '0';
            Area = Math.max(Area, ((rightmin[i] - leftmin[i] - 1) * val));
        }

        return Area;
    }

    int[] leftmin(char[] a, int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && a[st.peek()] - '0' >= (a[i] - '0')) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;

    }

    int[] rightmin(char a[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];// 2,1,5,6,2,3
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] - '0' >= (a[i] - '0')) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

}
