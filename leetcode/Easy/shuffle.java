
import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int []a={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(new Solution().shuffle(a, n)));
        
    }
    
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int b[]=new int[nums.length];
        int j=0;
        for(int i=0; i<n; i++){
            b[j++]=nums[i];
            b[j++]=nums[i+n];
        }

        return b;
        
    }
}