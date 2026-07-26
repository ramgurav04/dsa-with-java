class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int [n];
        int prodR = 1;
        int prodL = 1;
        
        // collect sufix r -> l
        for(int i=n-1; i>=0; i--)
        {
           ans[i] = prodR;
           prodR *= nums[i];
        }

        // collect prefix L -> R 
        for(int i=0; i<n; i++)
        {
            ans[i] *= prodL;
            prodL *= nums[i];
        }
        return ans;
    }
}