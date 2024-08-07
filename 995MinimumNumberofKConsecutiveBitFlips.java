class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int ans = 0; 
        int flips = 0; 
        int[] flipEffect = new int[n];
        for (int i = 0; i < n; i++) {
            flips ^= flipEffect[i];
            int actualBit = nums[i] ^ flips;
            if (actualBit == 0) {
                if (i + k > n) return -1; 
                ans++;
                flips ^= 1; 
                if (i + k < n) flipEffect[i + k] ^= 1; 
            }
        }

        return ans;
    }
}
