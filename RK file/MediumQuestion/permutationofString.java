import java.util.*;

public class permutationofString {
    public static void main(String[] args) {
        String a = "AAA";
        System.out.println(new Solution().permute(a));
    }

}

class Solution {

    public List<String> permute(String str) {
        List<String> st = new ArrayList<>();
        char a[] = str.toCharArray();
        permuteallVal(a, 0, a.length, st);
        Collections.sort(st);
        List<String> ans = new ArrayList<>();
        ans.add(st.get(0));
        int j=0;
        for(int i=1; i<st.size(); i++) {
            if(st.get(i).equals(ans.get(j))){
                continue;
            }
            else{
                ans.add(st.get(i));
                ++j;
            }
        }
        return ans;

    }

    void permuteallVal(char[] a, int l, int r, List<String> st) {
        if (l == r) {
            String c = "";
            for (int i = 0; i < a.length; i++) {
                c += a[i];
            }
            st.add(c);

            return;
        }
        for (int i = l; i < r; i++) {
            swap(a, i, l);
            permuteallVal(a, l + 1, r, st);
            swap(a, i, l);
        }
    }

    void swap(char a[], int i, int l) {
        char c = a[i];
        a[i] = a[l];
        a[l] = c;
    }
}