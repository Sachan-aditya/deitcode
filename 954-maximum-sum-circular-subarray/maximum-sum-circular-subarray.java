class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int current=nums[0];
        int total=nums[0];
        int min=nums[0];
        int currentmin=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            total+=nums[i];

          current=Math.max(nums[i],current+nums[i]);
           max=Math.max(max,current);
            currentmin=Math.min(nums[i],currentmin+nums[i]);
           min=Math.min(min,currentmin);
        }
        if(max<0)
        return max;
        return Math.max(max,total-min);//[5,-3,5]//kdane max=10 //kadane min=-3 //total=10-3=7 // now max=10,7==7
    }
}