public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{3,2,1}};
        System.out.println(new Solution().maximumWealth(a));
    }
    
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0; i<accounts.length;i++){
            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
               sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}