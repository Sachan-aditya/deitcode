class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
            p++;
            c=Math.max(p,c);
            }
            else 
            p=0;
        }
        return c;
    }
}