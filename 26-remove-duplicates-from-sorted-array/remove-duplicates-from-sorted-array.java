class Solution {
    public int removeDuplicates(int[] nums) {
        int p=0;int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[p]!=nums[i])
            {
                p++;
                nums[p]=nums[i];
            }
        }
        return p+1;
    }
}