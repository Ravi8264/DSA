// import java.util.*;
// public class Eliminationgame {
//     public static void main(String[] args) {
//         System.out.println(new Solution().lastRemaining(12));
//     }
// }

// class Solution {
//     public int lastRemaining(int n) {
//         boolean left = true;
//         int head = 1;
//         int step = 1;
//         int remain = n;
//         while(remain > 1){
//             if(left || remain%2 ==1){
//                 head = head + step;
//             }
//             step = step * 2;
//             remain = remain / 2;
//             left = !left;
//         }
//         return head;
//     }
// }


