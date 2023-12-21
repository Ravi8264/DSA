public class Power_Function {
    public static void main(String[] args) {
        int x=4, y=5;
        System.out.println(new Solution().power(x, y));
    }
    
}

 class Solution {
    public static double power(int x, int n)
    {
       return Math.pow(x,n);
      
    }
}