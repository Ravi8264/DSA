import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int a[]={3,2,2,3};
        System.out.println((new Solution().removeElement(a,2)));
    }
    
}
class Solution {
    public int removeElement(int[] nums, int val) {

        for(int i=0; i<nums.length; i++){
         if(nums[i]==val){
            continue;
         }
          
        }System.out.println(Arrays.toString(nums));
           return nums.length-val;
    }
}
