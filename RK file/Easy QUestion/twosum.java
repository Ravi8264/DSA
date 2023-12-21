import java.util.*;
class twosum {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        System.out.println(Arrays.toString(twoSum(arr, 3)));
       
    }

   

    public static int[] twoSum(int[] nums, int target){
        int ans[]=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
      
if(ans[0]==0 && ans[1]==0) return new int[0];
return ans;
    
 }
}






// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//      int left=0, right=nums.length-1;
//       int ans[]=new int[2];
//       while(left<right){
//         if(nums[left]==nums[right]){
//           --right;
          
//         }
//         else if(nums[left]+nums[right]==target){
//           ans[0]=left;
//           ans[1]=right;
//           break;
//         }
//         else if(nums[left]+nums[right]>target) --right;
//         else{
//           ++left;
//         }
//       }
//       if(ans[0]==0 && ans[1]==0){
//         int ans1[]=new int[0];
//         return ans1;
//       }
     
//       return ans;  
//     }
// }