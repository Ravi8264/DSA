import java.util.*;
public class minimisethemaximumdiffbtwtheheight {
    public static void main(String[] args) {
        int a[]={1,15,10};
        System.out.println(new Solution().getMinDiff(a,3,6));
    }
    
}

 class Solution {
    public static int getMinDiff(int[] A, int n, int k) {
       Arrays.sort(A);
    int min=0;
    int max=0;
    int height=A[n-1]-A[0];
    for(int i=1; i<n; i++){
        if(A[i]-k<0) continue;
        min=Math.min(A[0]+k,A[i]-k);
        max=Math.max(A[n-1]-k,A[i-1]+k);
        height=Math.min(height, max-min);
    }
     return height;
      
    }
}
