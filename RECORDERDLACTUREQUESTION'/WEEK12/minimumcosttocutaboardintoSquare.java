
// import java.util.*;

// public class minimumcosttocutaboardintoSquare {
//     public static void main(String[] args) {
//         int hor[] = { 4, 1, 2 };
//         int ver[] = { 2, 1, 3, 1, 4 };
//         System.out.println(minimumCostOfBreaking(hor, ver,hor.length,ver.length));
//          System.out.println(mincostBoard(hor, ver));

//     }

//     static int mincostBoard(int h[], int[] v) {
//         int hor = 1, ver = 1;
//         Arrays.sort(v);
//         Arrays.sort(h);
//         for (int i = 0; i < h.length / 2; i++) {
//             swap(h, i, h.length - 1 - i);
//         }
//         for (int i = 0; i < v.length/2; i++) {
//             swap(v, i, v.length - 1 - i);
//         }
//         // System.out.println(Arrays.toString(h));
//         // System.out.println(Arrays.toString(v));
//         int i = 0, j = 0, cost = 0;
//         while (i < v.length && j < h.length) {
//             if (h[j] < v[i]) {
//                 cost += hor * v[i];
//                 ver++;
//                 i++;
//             } else {
//                 cost += ver * h[j];
//                 hor++;
//                 j++;
//             }
//         }
//         int totalVerticalCost = 0;
//         while (i < v.length) {
//             totalVerticalCost += v[i] * hor;
//             i++;
//         }
//         cost += totalVerticalCost;

//         int totalHorizentalCost = 0;
//         while (j < h.length) {
//             totalHorizentalCost += h[j] * ver;
//             j++;

//         }
//         cost += totalHorizentalCost;
//         return cost;
//     }

//     private static void swap(int[] h, int i, int j) {
//         int temp = h[i];
//         h[i] = h[j];
//         h[j] = temp;
//     }

//     public static long minimumCostOfBreaking(int[] X, int[] Y, int M, int N) {
//         Arrays.sort(X);
//         Arrays.sort(Y);
//         long totalCost = 0;
//         long horizontalCost = 1;
//         long verticalCost = 1;
//         int i = M - 1; 
//         int j = N - 1; 
//         while (i >= 0 && j >= 0) {
//             if (X[i] > Y[j]) {
//                 totalCost += (horizontalCost * X[i]);
//                 ++verticalCost;
//                 i--;
//             } else {
//                 totalCost += (verticalCost * Y[j]);
//                 ++horizontalCost;
//                 j--;
//             }
//         }
//         while (i >= 0) {
//             horizontalCost += X[i];
//             i--;
//         }
//         while (j >= 0) {
//             verticalCost += Y[j];
//             j--;
//         }
//         totalCost += horizontalCost + verticalCost;
//         return totalCost;
//     }
// }

import java.util.Arrays;

class MinimumCostToCutBoardIntoSquare {
    public static void main(String[] args) {
        int hor[] = {1, 5 ,4 ,7, 5, 6, 6};
        int ver[] = { 3, 1, 2, 6, 7, 8, 1 };
        System.out.println(minimumCostToCutBoardIntoSquare(hor, ver, hor.length,
        ver.length));
    }

    public static long minimumCostToCutBoardIntoSquare(int[] X, int[] Y, int M, int N) {
        Arrays.sort(X);
        Arrays.sort(Y);

        int horizontalCuts = 1;
        int verticalCuts = 1;
        long totalCost = 0;

        int i = M - 1;
        int j = N - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                totalCost += (long) horizontalCuts * X[i];
                verticalCuts++;
                i--;
            } else {
                totalCost += (long) verticalCuts * Y[j];
                horizontalCuts++;
                j--;
            }
        }

        while (i >= 0) {
            totalCost += (long) horizontalCuts * X[i];
            i--;
        }

        while (j >= 0) {
            totalCost += (long) verticalCuts * Y[j];
            j--;
        }

        return totalCost;
    }
}
