import java.util.*;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 2, 2 };
        System.out.println(new Solution().findUnsortedSubarray(nums));
        
    }
    
}


class Solution {
    public int findUnsortedSubarray(int[] nums) {
       int n=nums.length;
       int b[]=nums.clone();
       Arrays.sort(b);
       int min=n,max=0;
      for(int i=0; i<n; i++){
          if(b[i]!=nums[i]){
             min=Math.min(min,i);
             max=Math.max(max,i);
          }
      }
      if(max ==0)return 0;
      return max-min+1;
    }
    
}



// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         int n=nums.length;
//         for(int i=0; i<n; i++){
//             if(i>0 && nums[i]==nums[i-1])continue;
//             for(int j=i+1; j<n; j++){
//                 if(nums[i]>nums[j]){
//                     if(i<min){
//                         min=i;
//                     }
//                     if(j>max){
//                         max=j;
//                     }
//                    int temp=nums[i];
//                     nums[i]=nums[j];
//                     nums[j]=temp;
//                 }
//             }
//         }
//         if(max !=Integer.MIN_VALUE){
//             return max-min+1;
//         }
//         return 0;
    
//     }
// }