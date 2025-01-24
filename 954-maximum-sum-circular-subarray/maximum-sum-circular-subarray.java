class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int c=nums[0];
        int max=nums[0];
        int min=nums[0];
        int total=nums[0];
        int cmin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
             total+=nums[i];
             c=Math.max(nums[i],c+nums[i]);
             max=Math.max(max,c);
             cmin=Math.min(nums[i],cmin+nums[i]);
             min=Math.min(min,cmin);
        }
        if(max<0)
        return max;
        return Math.max(max,total-min);
    }
}