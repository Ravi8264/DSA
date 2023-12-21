import java.util.Arrays;
import java.util.Scanner;

public class leetcode {
    public static void main (String args[]){
     
     
      int []m={ 5, 0, 1, 2, 3, 4};
    
        System.out.println(Arrays.toString(new Solution().buildArray(m)));
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
     int b[]=new int[nums.length];
           for(int i=0; i<nums.length; i++){
            b[i]=nums[nums[i]];
           }
        return b;
        
    }
}





