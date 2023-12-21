import java.util.*;

public class integertoroman {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(10));
    }

}

class Solution {
    public String intToRoman(int n) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(4, "IV");
        hm.put(5, "V");
        hm.put(10, "X");
        hm.put(50, "L");
        hm.put(100, "C");
        hm.put(500, "D");
        hm.put(1000, "M");
        

    }
}