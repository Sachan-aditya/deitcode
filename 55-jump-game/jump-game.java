class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max=0;//32104
        for(int i=0;i<nums.length;i++)
        {  if(i>max)
            return false;
          
            max=Math.max(max,i+nums[i]);//3//3
            if(max>=n-1)
            return true;
        }
        return false;
        
    }
}