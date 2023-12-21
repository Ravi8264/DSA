import java.util.*;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String a[] = { "++X", "X--", "X++" };
        System.out.println(new Solution().finalValueAfterOperations(a));

    }

}

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a = 0;
        for (String i : operations) {
            if ((i.equals("X++") || i.equals("++X"))) {
                ++a;
            }

            else {
                --a;
            }

        }
        return a;
    }
}
\
\

