public class JewelsandStones {
    public static void main(String[] args) {
        String a = "aA";
        String b = "aAAbbbb";
        System.out.println(new Solution().numJewelsInStones(a, b));

    }

}

// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {

//         char[] p = jewels.toCharArray();
//         char[] c = stones.toCharArray();
//         int count = 0;
//         for (Character i : p) {
//             for (Character j : c) {
//                 if (i == j) {
//                     ++count;
//                 }
//             }
//         }
//         return count;

//     }
// }

class Solution{
    public int numJewelsInStones(String jewels, String stones){
        int count=0, i=stones.length()-1;
        while(i>=0){
            count+=jewels.indexOf(stones.charAt(i))>-1?1:0;
            --i;
        }
        return count;
    }

}