class Solution {
    public int maxSubArray(int[] nums) {
        int s=nums[0];
        int max=nums[0];int n=nums.length;
        for(int i=1;i<n;i++)
        {
            s=Math.max(nums[i],s + nums[i]);
            max=Math.max(s,max);
         
}
return max;
    }
}