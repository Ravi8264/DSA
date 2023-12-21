
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String a=in.nextLine();
        System.out.println(new Solution().lengthOfLongestSubstring(a));
    }
    
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> st=new ArrayList<>();
        int max=0;
        for(int i=0; i<s.length(); i++){
            char check=s.charAt(i);
            st.add(check);
             for(int j=i+1; j<s.length(); j++){
                if(st.contains(s.charAt(j))){
                    j=s.length();
                }
                else{
                    st.add(s.charAt(j));
                }
             }
            //  System.out.println(st);
             if(st.size()>max){
                max=st.size();
             }
             st.clear();
        }
        return max;
        
    }
}