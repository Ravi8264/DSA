import java.util.*;

public class generateAbinarynumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(new Solution().generate(n));
    }

}

// class Solution {
//     public static ArrayList<String> generate(int N) {
//         ArrayList<String> ans = new ArrayList<>();
//         for (int i = 1; i <= N; i++) {
//             String str = "";
//             int temp = i;
//             while (temp != 0) {
//                 if ((temp & 1) == 1)
//                     str = 1+str;
//                 else
//                     str = 0+str;
//                 temp = temp >> 1;
//             }
//             ans.add(str);

//         }
//         return ans;

//     }
// }



class Solution {

    public static ArrayList<String> generate(int N) {
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=0; i<N; i++) {
            String temp = q.remove();
            list.add(temp);
            q.add(temp+"0");
            q.add(temp+"1");
        }
        return list;
   

    }
}