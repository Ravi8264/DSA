public class factorial {
    public static void main(String[] args) {
        System.out.println(new Solution().factorial(5));
    }
    
}


 class Solution{
    public static int factorial(int n){
        if(n==1 ||n==0) return 1;
        return n*factorial(n-1);
      
    }
}