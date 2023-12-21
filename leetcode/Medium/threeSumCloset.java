import java.util.*;

public class threeSumCloset {
    public static void main(String[] args) {
        int a[] = { -1, 2, 1, -4};
        int target = 2;
        System.out.println(new Solution().threeSumClosest(a, target));
    }

}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j=i+1,k=nums.length-1;

            while(j<k){

            }

        }
        return 0;
    }
}