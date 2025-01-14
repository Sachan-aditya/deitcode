class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return nums[0];
        int prev=0;
        int prev2=0;
        for(int i:nums)
        {
            int temp=prev;
            prev=Math.max(prev,prev2+i);
            prev2=temp;
        }
        return prev;
    }
}