
    
public class minimumsum {
    public static void main(String[] args) {
        int a[]={2,3,1,2,4,3};
        int target=7;
        System.out.println(new Solution().minSubArrayLen(target,a));
    }


}

class Solution
{
    public int minSubArrayLen(int K, int[] A)
    {
        int l=0,n=A.length,r=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(r<n){
            sum+=A[r];
            while (sum>=K){
                min=Math.min(min,r-l+1);
                sum-=A[l];
                l++;
            }
            r++;
        }
if(min==Integer.MAX_VALUE) return 0;
return min;


    }
}