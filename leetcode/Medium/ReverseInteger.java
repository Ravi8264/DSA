public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-12));

    }

}
// class Solution {
// public int reverse(int x) {
// String ans="";
// ans+=x;
// StringBuilder result=new StringBuilder(ans);
// StringBuilder k=result.reverse();
// int resultVal=Integer.parseInt(k.toString());
// return resultVal;

// }
// }

class Solution {
    public int reverse(int x) {
        int val=x;
        if(val<0){
            x=Math.abs(x);
        }
        int ans = 0, k = 1;
        String p = "";
        p += x;
        for (int i = 0; i < p.length() - 1; i++) {
            k *= 10;

        }
      
        while (x > 0) {
            ans += (x % 10) * k;
            
            k = k / 10;
            x = x / 10;
        }
        if(val<0){
            ans=-ans;
        }
        return ans;
    }
}