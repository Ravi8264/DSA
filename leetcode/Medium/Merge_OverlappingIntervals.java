import java.util.ArrayList;
import java.util.*;

public class Merge_OverlappingIntervals {
    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int ans[][] = new Solution().merge(intervals);
        for (int[] row : ans) {
            for (int element : row) {
                System.out.print(element + " ");

            }
            System.out.println();
        }
    }
}

    

//     public static int[][] merge(int[][] intervals) {
//         if (intervals == null || intervals.length <= 1) {
//             return intervals;
//         }
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         List<int[]> mergePath = new ArrayList<>();
//         int[] currentPath = intervals[0];
//         for (int i = 1; i < intervals.length; i++) {
//             int[] interval = intervals[i];
//             System.out.println(currentPath[1]+"       "+interval[0]);
//             if (currentPath[1] >= interval[0]) {
//                 currentPath[1] = Math.max(currentPath[1], interval[1]);
//             } else {
//                 mergePath.add(currentPath);
//                 currentPath = interval;
//             }
//         }
//         mergePath.add(currentPath);
//         int[][] result = new int[mergePath.size()][2];
//         for (int i = 0; i < mergePath.size(); i++) {
//             result[i] = mergePath.get(i);
//         }

//         return result;
//     }
// }

class Solution {
public int[][] merge(int[][] intervals) {
        ArrayList<int[]> st=new ArrayList<>();
        int [] curInterval=intervals[0];
        //System.out.println(Arrays.toString(curInterval));
        for(int i=1; i<intervals.length; i++){
            int []interval=intervals[i];
            if(curInterval[1]>=interval[0]){
                curInterval[1]=Math.max(curInterval[1], interval[1]);
            }
            else{
                st.add(curInterval);
                curInterval=interval;
            }

        }
        System.out.println(st);
        return null;
    }
}
