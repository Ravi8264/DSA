// Input: number = 7
 
// Output:

//        *
//       ***
//      *****
//     *******
//    *********
//   ***********
//  *************
//   ***********
//    *********
//     *******
//      *****
//       ***
//        *


import java.util.*;
class Doubt{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(), k = 0;
        for (int i = 1; i <= 2 * n + 1; i++) {
            k = n + 1 >= i ? ++k : --k;
            for (int j = 1; j <= 2 * n + 1; j++) {
                if (j > n - k + 1 && j < n + k + 1) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}