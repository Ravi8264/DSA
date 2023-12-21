import java.util.*;
class Nqueenproblem {
    public static void main(String[] args) {
       int n=4;
       System.out.println(new Solution().solveNQueens(n));
    }
    
}



//  class Solution {
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> solutions = new ArrayList<>();
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '.';
//             }
//         }
//         solveNQueens(solutions, board, 0);
//         return solutions;
//     }

//     private void solveNQueens(List<List<String>> solutions, char[][] board, int row) {
//         if (row == board.length) {
//             solutions.add(constructSolution(board));
//             return;
//         }

//         for (int col = 0; col < board.length; col++) {
//             if (isSafe(board, row, col)) {
//                 board[row][col] = 'Q';
//                 solveNQueens(solutions, board, row + 1);
//                 board[row][col] = '.';
//             }
//         }
//     }

//     private boolean isSafe(char[][] board, int row, int col) {
//         for (int i = 0; i < row; i++) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     private List<String> constructSolution(char[][] board) {
//         List<String> solution = new ArrayList<>();
//         for (int i = 0; i < board.length; i++) {
//             solution.add(new String(board[i]));
//         }
//         return solution;
//     }
// }



class Solution
{
    public List<List<String>> solveNQueens(int n)
    {
        //You can code here

   

       List<List<String>> allBoards = new ArrayList<>();
       char[][] board = new char[n][n];
      
       helper(board, allBoards, 0);
       return allBoards;

    }

   public void helper(char[][] board, List<List<String>> allBoards, int col) {
       if(col == board.length) {
           saveBoard(board, allBoards);
           return;
       }
      
       for(int row=0; row<board.length; row++) {
           if(isSafe(row, col, board)) {
               board[row][col] = 'Q';
               helper(board, allBoards, col+1);
               board[row][col] = '.';
           }
       }
   }




   public boolean isSafe(int row, int col, char[][] board) {
       //horizontal
       for(int j=0; j<board.length; j++) {
           if(board[row][j] == 'Q') {
               return false;
           }
       }
      
       //vertical
       for(int i=0; i<board.length; i++) {
           if(board[i][col] == 'Q') {
               return false;
           }
       }
      
       //upper left
       int r = row;
       for(int c=col; c>=0 && r>=0; c--, r--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //upper right
       r = row;
       for(int c=col; c<board.length && r>=0; r--, c++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower left
       r = row;
       for(int c=col; c>=0 && r<board.length; r++, c--) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       //lower right
       for(int c=col; c<board.length && r<board.length; c++, r++) {
           if(board[r][c] == 'Q') {
               return false;
           }
       }
      
       return true;
   }


  public void saveBoard(char[][] board, List<List<String>> allBoards) {
       String row = "";
       List<String> newBoard = new ArrayList<>();
      
       for(int i=0; i<board.length; i++) {
           row = "";
           for(int j=0; j<board[0].length; j++) {
               if(board[i][j] == 'Q')
                   row += 'Q';
               else
                   row += '.';
           }
           newBoard.add(row);
       }
      
       allBoards.add(newBoard);
   }

}