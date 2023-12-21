
    
import java.util.*;
public class Max_consicutive {
    public static void main(String[] args) {
        int []nums={4 ,4 ,2 ,5, 2 ,9, 10 ,3, 6, 6 };
        System.out.println(new Solution().maximumGap(nums));
    }
}

class Solution {
	public int maximumGap(int[] nums) {
        Arrays.sort(nums);
      int max=0;
   for(int i=0; i<nums.length-1; i++){
    
      max=Math.max(max,nums[i+1]-nums[i]);
    
     
   }
      return max;
	}
}