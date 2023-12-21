import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int a[]={ 1, 3, 2, 1};
        System.out.println(Arrays.toString(new Solution().getConcatenation(a)));
        
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []b=new int[2*n];
        // int j=0;
        // for(Integer i:nums){
        //      b[j++]=i;
        // }
        //  for(Integer k:nums){
        //      b[j++]=k;
        // }
        // return b;



        for(int i=0; i<b.length; i++){
            b[i]=nums[i%n];
        }
        return b;
    }
}