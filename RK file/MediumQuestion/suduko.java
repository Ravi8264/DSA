public class suduko {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        new Solution().solveSudoku(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// class Solution {
// public void solveSudoku(char[][] board) {
// helper(board, 0, 0);
// }
// boolean helper(char[][] board, int row, int col) {
// if (row == board.length) {
// return true;
// }
// if (col == board.length ) {
// return helper(board, row+1, 0);
// }
// if (board[row][col] != '.') {
// if (helper(board, row, col+1)) {
// return true;
// }
// } else {
// for (int i = 1; i <= 9; i++) {
// if (isSafe(board, row, col, i)) {
// board[row][col] = (char) (i + '0');
// if (helper(board, row, col)) {
// return true;
// } else {
// board[row][col] = '.';
// }
// }
// }
// }
// return false;
// }
// boolean isSafe(char [][]board,int row,int col,int number){
// for(int i=0; i<board.length; i++){
// if(board[i][col]==(char)(number+'0')){
// return false;
// }
// }
// for(int j=0; j<board.length; j++){
// if(board[row][j]==(char)(number+'0')){
// return false;
// }
// }
// int sr=3*(row/3);
// int sc=3*(col/3);
// for(int i=sr; i<sr+3; i++){
// for(int j=sc; j<sc+3; j++){
// if(board[i][j]==(char)(number+'0')){
// return false;
// }
// }
// }
// return true;
// }

// }

// class Solution {
// public void solveSudoku(char[][] board) {
// solve(board, 0, 0);
// }
// private boolean solve(char[][] board, int row, int col) {
// if (row == board.length) {
// return true;
// }
// if (col == board[0].length) {
// return solve(board, row + 1, 0);
// }
// if (board[row][col] != '.') {
// return solve(board, row, col + 1);
// }
// for (char num = '1'; num <= '9'; num++) {
// if (isValidPlacement(board, row, col, num)) {
// board[row][col] = num;
// if (solve(board, row, col + 1)) {
// return true;
// }
// board[row][col] = '.';
// }
// }
// return false;
// }
// private boolean isValidPlacement(char[][] board, int row, int col, char num)
// {
// for (int i = 0; i < board.length; i++) {
// if (board[i][col] == num) {
// return false;
// }
// if (board[row][i] == num) {
// return false;
// }
// int subgridRow = 3 * (row / 3) + i / 3;
// int subgridCol = 3 * (col / 3) + i % 3;
// if (board[subgridRow][subgridCol] == num) {
// return false;
// }
// }
// return true;
// }
// }

// class Solution{

// public static boolean isSafe(char[][] board, int r, int c, int n) {
// //column
// for(int i=0; i<board.length; i++) {
// if(board[i][c] == (char)(n+'0')) {
// return false;
// }
// }
// //row
// for(int j=0; j<board.length; j++) {
// if(board[r][j] == (char)(n+'0')) {
// return false;
// }
// }
// //grid
// int sr = 3 * (r/3);
// int sc = 3 * (c/3);

// for(int i=sr; i<sr+3; i++) {
// for(int j=sc; j<sc+3; j++) {
// if(board[i][j] == (char)(n+'0')) {
// return false;
// }
// }
// }
// return true;
// }
// public static boolean solveSudokuH(char[][] board,int r,int c){
// if(r == board.length ){
// return true;
// }
// int nr=0, nc=0;
// if(c == board.length-1) {
// nr = r + 1;
// nc = 0;
// } else {
// nr = r;
// nc = c + 1;
// }
// if(board[r][c] != '.') {
// if(solveSudokuH(board, nr, nc)) {
// return true;
// }
// } else {
// //fill the place
// for(int i=1; i<=9; i++) {
// if(isSafe(board, r, c, i)) {
// board[r][c] = (char)(i+'0');
// if(solveSudokuH(board, nr, nc))
// return true;
// else
// board[r][c] = '.'; //backtracking
// }
// }
// }
// return false;
// }
// public static void solveSudoku(char[][] board) {
// solveSudokuH(board,0,0);

// }
// }

// class Solution {

//     public void solveSudoku(char[][] board) {
//         // You can code here
//         print(board);
//     }

//     public static void print(char[][] board) {
//         if (sudokuHelper(board, 0, 0));
//         for (int i = 0; i <= 8; i++) {
//             for (int j = 0; j <= 8; j++)
//                 System.out.print(board[i][j] + " ");
//             System.out.println();
//         }

//     }

//     public static boolean isSafe(char[][] board, int row, int col, char num) {
//         for (int x = 0; x < board.length; x++) {
//             if (board[row][x] == (char) (num + '0')) {
//                 return false;
//             }
//         }

//         for (int x = 0; x < board.length; x++) {
//             if (board[x][col] == (char) (num + '0')) {
//                 return false;
//             }
//         }

//         int startRow = row - row % 3, startCol = col - col % 3;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (board[i + startRow][j + startCol] == num) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static boolean sudokuHelper(char[][] board, int row, int col) {
//         if (row == board.length)
//             return true;

//         if (col == board.length) {
//             return sudokuHelper(board, row + 1, 0);
//         }

//         if (board[row][col] != '.') {
//             return sudokuHelper(board, row, col + 1);
//         }

//         for (char num = 1; num <= 9; num++) {
//             if (isSafe(board, row, col, num)) {
//                 board[row][col] = (char) (num + '0');

//                 if (sudokuHelper(board, row, col + 1)) {
//                     return true;
//                 }
//                 board[row][col] = '.';
//             }
//         }
//         return false;
//     }
// }


class Solution {

    public void solveSudoku(char[][] board) {
        //You can code here
        print(board);
    }

    public static void print(char[][] board) {
      if (sudokuHelper(board, 0, 0));
        
    }

    public static boolean isSafe(char[][] board, int row, int col, char num) {
       for(int x = 0; x < board.length; x++) {
          if(board[row][x] == (char)(num + '0')) {
            return false;
          }
       }

       for(int x = 0; x < board.length; x++) {
          if(board[x][col] == (char)(num + '0')) {
            return false;
          }
       }

       int startRow = row - row % 3, startCol = col - col % 3;
       for (int i = 0; i < 3; i++) {
         for(int j = 0; j < 3; j++) {
            if (board[i + startRow][j + startCol] == (char) (num + '0')) {
               return false;
            }
         }
       }
       return true;
    }


    public static boolean sudokuHelper(char[][] board, int row, int col ) {
       if (row == board.length) return true;

       if (col == board.length) {
          return sudokuHelper(board, row+1, 0);
       }

       if (board[row][col] != '.') {
          return sudokuHelper(board, row, col+1);
       }

       for(char num = 1; num <= 9; num++) {
          if(isSafe(board, row, col, num)) {
             board[row][col] = (char)(num + '0');

             if (sudokuHelper(board, row, col+1)) {
               return true;
             }
             board[row][col] = '.';
          }
       }
       return false;
    }
}