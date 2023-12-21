// import java.util.Scanner;

// class CodeChef{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for(int i=0;i<t;i++){
//             int n = sc.nextInt();
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int bob = 0;
//             int alice = 0;
//             int aliceBob = 0;
//             for(int j=0;j<n;j++){

//                 int temp = sc.nextInt();

//                 if(temp%a==0 && temp%b==0)
//                     aliceBob++;
//                 else if(temp%a==0)
//                     bob++;
//                 else if(temp%b==0)
//                     alice++;
//             }
//             if(aliceBob!=0)
//                 bob++;
//             if(bob>alice)
//                 System.out.println("BOB");
//             else
//                 System.out.println("ALICE");
//         }
//     }
// }

/* package codechef; // don't place package name! */

// import java.util.Scanner;

// class ChefProblem {
// 	public static void main(String[] args) throws java.lang.Exception {
// 		Scanner scn = new Scanner(System.in);
// 		int t = scn.nextInt();

// 		for (int i = 0; i < t; i++) {
// 			int n = scn.nextInt();
// 			long res = 0;
// 			if (n > 2) {
// 				int a = n / 2 + 1;
// 				int b = n - a;
// 				if (a % 2 == 0 && b % 2 == 0) {
// 					a++;
// 					b--;
// 				}
// 				res = (long) a * b - 1;
// 			}
// 			System.out.println(res);

// 		}
// 	}
// }
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n > 0) {
			int a = scn.nextInt();
			String b = scn.next();
			int len = b.length();
			String c = "";
			int i;
			for (i = 0; i < len / 2; i++) {
				char k = b.charAt(i);
			
				if (k == '1')
					c = c + '1';
				else
					c = '0' + c;
				char l = b.charAt(len - i - 1);
				if (l == '1') {
					c = '1' + c;
				} else {
					c = c + '0';
				}

			}
			if (len % 2 != 0) {
				char k = b.charAt(i); 
				if (k == '1')
					c = c + '1';
				else
					c = '0' + c;
			}
			System.out.println(c);
			n--;
		}
	}
}
