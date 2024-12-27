class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int window=0;
        for(int right=0;right<n;right++)
        {
            window+=nums[right];
           ans=Math.max(ans,window);
        if(window<0)
           {
        window=0;
           }

        }
        return ans;
    }
}