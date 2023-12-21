public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(new Solution().lengthOfLastWord(s));
    }

}
// class Solution {
// public int lengthOfLastWord(String s) {
// s.trim();
// String ans[]=s.split(" ");
// return ans[ans.length-1].length();

// }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        String p=s.trim();
        System.out.println(p);
        int i = p.length() - 1, count = 0;
        
        while (i >= 0 && p.charAt(i) != ' ') {
            ++count;
            i--;
        }
        return count;

    }
}
