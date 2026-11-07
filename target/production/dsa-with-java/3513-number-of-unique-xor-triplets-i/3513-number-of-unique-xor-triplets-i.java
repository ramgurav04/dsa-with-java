class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        
        if (n <= 2) {
            return n;
        }
        
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        
        // The total number of unique XOR values is 2^bits
        return 1 << bits;
    }
}