import java.util.Scanner;

public class power_of_x_n {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(new Solution().myPow(a, b));
    }  
}


// class Solution {
//     public double myPow(double x, int n) {
//         long p=(long)n;
//         if(x<0 || p<0){
//             if(x==1 || x==0){
//               return x;
//             }
//             if(x==-1 && p%2!=0) return -1;
//             if(x==-1 && p%2==0) return 1;
//         }
//         if(x==0 || x==1) return x;
//         if(n<0) {x=1/x; p=Math.abs(p);
       
//         }
//         if(p==0) return 1;
//         double k=1;
//         while(p>0){
//             if(p%2 !=0){
//                 k=k*x;
//             }
//             p=p/2;
//             x=x*x;
//         }
//         return k;
//     }
// }


//Recursion
class Solution {
    public double myPow(double x, int n) {
        long p=(long) n;
        if(x==1) return 1;
        double val= mypowValue(x,Math.abs(p));
        if(n<0){
            val=1/val;
        }
        return val;
    }
    double mypowValue(double x, long p){
         double r=1;
          while(p>0){
            if((p & 1) != 0){
                r*=x;
            }
            p=p>>1;
            x=x*x;
        }
        return r;
    }
}



