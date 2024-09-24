class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n*(n+1)/2;int p=0;
        for(int i=0;i<nums.length;i++)
        {
            p+=nums[i];
        }
        return s-p;
    }
}