
// public class kingtour {

//     public static void main(String[] args) {
//         int a[][] = knightTour(2, 3);
//         int n = a.length;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[0].length; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
// }

//     public static int[][] knightTour(int n, int m) {
//         //You can code here

//       int a[][]=new int[n][m];

//         for (int i=0; i<n; i++){
//             for (int j=0; j<m; j++){
//                 a[i][j]=-1;
//             }
//         }

//         a[0][0]=0;
//         int movesX[]={2,1,-1,-2,-2,-1,1,2};
//         int movesY[]={1,2,2,1,-1,-2,-2,-1};

//         helper(n,m, a, movesX, movesY, 0,0,1);

//         if(m > 1 && a[0][1] == -1){
//             a[0][0] = -1;
//         }

//         if(n > 1 && a[1][0] == -1){
//            a[0][0] = -1;
//         }

//         return a;

//     }

//       static boolean helper(int n, int m, int a[][], int movesX[], int movesY[], int currX, int currY, int step){

//         if (step == n*m){
//             return true;
//         }

//         for (int i=0; i<8; i++){
//             int nextX=currX+movesX[i];
//             int nextY=currY+movesY[i];

//             if (isValid(n, m, a, nextX, nextY)){

//                 a[nextX][nextY]=step;
//                 boolean isTourCompleted=helper(n,m,a , movesX, movesY, nextX, nextY, step+1);
//                 if (isTourCompleted){
//                     return true;
//                 }
//                 else {
//                     a[nextX][nextY]=-1;  //backtracking
//                 }
//             }
//         }
//         return false;
//     }

//     private static boolean isValid(int n, int m, int[][] a, int x, int y) {

//         return x>=0 && y>=0 && x<n && y<m && a[x][y]==-1;
//     }
// }

public class kingtour {

    public static void main(String args[]) {
        int n = 5;
        int a[][] = knightsTour(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] knightsTour(int n) {
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = -1;
            }
        }

        a[0][0] = 0;
        int movesX[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int movesY[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        knightsTourHelper(n, a, movesX, movesY, 0, 0, 1);
        return a;
    }

    static boolean knightsTourHelper(int n, int a[][], int movesX[], int movesY[], int curX, int curY, int step) {
        if (step == n * n)
            return true;
        for (int i = 0; i < 8; i++) {
            int nextX = curX + movesX[i];
            int nextY = curY +  movesY[i];
            if (isValid(n, a, nextX, nextY)) {
                a[nextX][nextY] = step;
                boolean isTourCompletedByGoingThere = knightsTourHelper(n, a, movesX, movesY, nextX, nextY, step + 1);
                if (isTourCompletedByGoingThere) {
                    return true;
                } else {
                    a[nextX][nextY] = -1;
                }
            }
        }
        return false;
    }

    static boolean isValid(int n, int a[][], int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n && a[x][y] == -1;
    }
}