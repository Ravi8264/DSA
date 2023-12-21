import java.util.*;
public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        System.out.println(new Solution().findTheWinner(n,k));
    }
    
}

class Solution {
    public int findTheWinner(int n, int k) {
        return winner(n,k)+1;
    }
    int winner(int n,int k){
        if(n==1) return 0;
        return (winner(n-1,k)+k)%n;
    }
}