public class goodpair {
    public static void main(String[] args) {
     int []nums={ 1, 1, 1, 1};
     System.out.println(new Solution().numIdenticalPairs(nums));
    }
    
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j])++count;
            }
        }
        return count;
    }
}