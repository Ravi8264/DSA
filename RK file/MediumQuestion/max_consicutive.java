import java.util.*;
public class max_consicutive {
    public static void main(String[] args) {
        int []arr={4 ,4 ,2 ,5, 2 ,9, 10 ,3, 6, 6 };
        System.out.println(new Solution().maximumGap(arr));
    }
}

class Solution {
	public int maximumGap(int[] arr) {
        Arrays.sort(arr);
      int max=0;
   for(int i=0; i<arr.length-1; i++){
    if(arr[i+1]-arr[i]>1){
      max=Math.max(max,arr[i+1]-arr[i]);
    }
     
   }
      return max;
	}
}