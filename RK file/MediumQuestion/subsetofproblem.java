import java.util.*;

public class subsetofproblem {
    public static void main(String[] args) {

        String a = "abcd";
        System.out.println(new Solution().findSubstrings(a));

    }
}

// class Solution {

//     public static List<String> findSubstrings(String s) {
//         ArrayList<String> st = new ArrayList<>();
//         String a = "";
//         findSub(s, st, 0, a);
//         Collections.sort(st);
//         int index = 0;
//         st.remove(0);
//         return st;

//     }

//     static void findSub(String s, ArrayList<String> st, int index, String curr) {
//         if (s.length() == index) {
//             st.add(curr);
//             return;
//         }
//         findSub(s, st, index + 1, curr + s.charAt(index));
//         findSub(s, st, index + 1, curr);
//     }

// }



 class Solution {
  static List<String>helperFindSubstrings(String ans,int i, String curr,List<String>ls){
    if(i==ans.length()){
      if(!curr.equals(" ")){
      ls.add(curr);
   return ls;
      }
    }
    helperFindSubstrings(ans,i+1,curr+ans.charAt(i),ls);
    helperFindSubstrings(ans,i+1,curr,ls);
    return ls;
  }

    public static List<String> findSubstrings(String s) {
    List <String> ls=new ArrayList<>();
      String curr="";
      helperFindSubstrings(s,0, curr,ls);


      Collections.sort(ls);
      ls.remove(0);

return ls;




    }
}

