import java.util.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(new Solution().longestPalindrome(a));
    }
}



// class Solution {
//     public String longestPalindrome(String s) {
//         StringBuilder st = new StringBuilder(s);
//         int n = s.length();
//         boolean a=false;
//         for(int i=0; i<n-1; i++){
//             if(s.charAt(i)==s.charAt(i+1)){
//                 a=true;
//                 continue;
//             }
//             else{
//                 a=false;
//                 break;
//             }

//         }
//         if(a==true) return s;
//         ArrayList<String> palindrome = new ArrayList<>();
//         for (int i = 0; i < s.length(); i++) {
//             n = s.length();
//             while (n > i) {
//                 if (s.charAt(i) == s.charAt(n - 1)) {
//                     StringBuilder q = new StringBuilder(s.substring(i, n));
//                     String m = q.reverse().toString();
//                     if (m.equals(s.substring(i, n))) {
//                         palindrome.add(s.substring(i, n));
//                     }
//                 }
//                 n--;
//             }
//         }
//         int index = 0, size = 0;
//         for (int i = 0; i < palindrome.size(); i++) {

//             if (palindrome.get(i).length() > size) {
//                 size = palindrome.get(i).length();
//                 index = i;
//             }
//         }
//         return palindrome.get(index);
       
      
//     }
// }


class Solution {
    public String longestPalindrome(String s) {

        int start =0,end=0;
        for(int i=0;i<s.length();i++){
            
            int len1= extendPel(s,i,i);
            int len2=extendPel(s,i,i+1);
            int len =Math.max(len1,len2);
            // System.out.println(len);
            if(len>(end-start)+1){   
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    int extendPel(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;  
    }
}