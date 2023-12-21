import java.util.*;
public class REmoveDuplicate {
    public static void main(String[] args) {
        int []b={1,1,2};
        System.out.println(new Solution().removeDuplicates(b));
    }
    
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int b[]=new int[1];
        b[0]=nums[0];
        int count=0;
        for(int i=1; i<nums.length; i++){
               if(nums[i]==nums[i-1]){
                ++count;
                continue;
               }
               else{
                b=Arrays.copyOf(b, b.length+1);
                b[b.length-1]=nums[i];
               }

        }
        for(int k=0; k<b.length; k++){
            nums[k]=b[k];
        }
        return b.length;
    }
}