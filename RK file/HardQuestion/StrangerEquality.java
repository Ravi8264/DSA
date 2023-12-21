public class StrangerEquality {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(new Solution().countValues(n));

    }

}

// class Solution {
//     public int countValues(int n) {
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             int a = n;
//             if ((a ^ i) ==n+i) {
//             System.out.println(a^i);
//                 ++count;
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int countValues(int n)
    {
        int unset_bits = 0;
    
        while (n != 0)
        {
            if ((n & 1) == 0)
            { 
                unset_bits++;
            }
             System.out.println(n);
    
            n = n >> 1;
        }
    
        return (int) Math.pow(2, unset_bits);
    }
}