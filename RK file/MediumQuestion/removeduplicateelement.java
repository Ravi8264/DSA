import java.util.ArrayDeque;
import java.util.*;

public class removeduplicateelement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        System.out.println(new Solution().removeDuplicateLetters(a));
    }

}

// class Solution {
// public String removeDuplicateLetters(String s) {
// Stack<Character> stack = new Stack<>();
// boolean taken[] = new boolean[26];
// int freq[] = new int[26];
// for (int i = 0; i < s.length(); i++) {
// freq[s.charAt(i) - 'a']++;
// }
// //System.out.println(Arrays.toString(freq));
// for (int i = 0; i < s.length(); i++) {
// char ch = s.charAt(i);
// freq[ch - 'a']--;
// if (taken[ch - 'a'])
// continue;
// while (stack.size() > 0 && stack.peek() > ch && freq[stack.peek() - 'a'] > 0)
// {
// taken[stack.pop() - 'a'] = false;
// }
// stack.push(ch);
// taken[ch - 'a'] = true;
// }
// char ans[]=new char[stack.size()];
// int len=ans.length;
// while(len>0)ans[--len]=stack.pop();
// return new String(ans);

// }
// }

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        boolean taken[] = new boolean[26];
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if (taken[idx])
                continue;
            if (stack.size() > 0)
                //System.out.println(freq[stack.peek() - 'a'] + "   " + i + "  " + ch);
            while (stack.size() > 0 && stack.peek() > ch && freq[stack.peek() - 'a'] > i) {
                taken[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            taken[ch - 'a'] = true;
        }
        char ans[] = new char[stack.size()];
        int len = ans.length;
        while (len > 0)
            ans[--len] = stack.pop();
        return new String(ans);
    }
}

// class Solution {
// public String removeDuplicateLetters(String s) {
// ArrayDeque<Character> st = new ArrayDeque<>();
// int n = s.length();
// boolean taken[] = new boolean[26];
// int[] lastIndex = new int[26];
// for (int i = 0; i < n; i++) {
// char ch = s.charAt(i);
// lastIndex[ch - 'a'] = i;
// }
// for (int i = 0; i < n; i++) {
// char ch = s.charAt(i);
// int idx = ch - 'a';
// if (taken[idx]) {
// continue;
// }
// while (!st.isEmpty() && st.peek() > ch && lastIndex[st.peek() - 'a'] > i) {
// taken[st.peek() - 'a'] = false;
// st.pop();
// }
// st.push(ch);
// taken[idx] = true;
// }
// StringBuilder v = new StringBuilder();
// while (!st.isEmpty()) {
// v.append(st.pop());
// }
// v.reverse();
// return v.toString();
// }
// }

// class Solution {
// public String removeDuplicateLetters(String s) {
// ArrayDeque<Character> st = new ArrayDeque<>();
// int n=s.length();
// int lastindex[]=new int[26];
// boolean taken[]=new boolean[26];
// for(int i=0; i<n; i++){
// char ch=s.charAt(i);
// lastindex[ch-'a']=i;
// }
// for(int i=0; i<n; i++){
// char ch=s.charAt(i);
// if(taken[i]){
// continue;
// }
// while(!st.isEmpty() && st.peek()>ch && lastindex[ch-'a']>i){
// taken[st.peek()-'a']=false;
// st.pop();
// }
// taken[ch-'a']=true;
// st.push(ch);
// }
// StringBuilder ans=new StringBuilder();
// while(!st.isEmpty()){
// ans.append(st.pop());
// }
// ans.reverse();
// return ans.toString();
// }
// }