class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;int d=1;
      for(int i=1;i<nums.length;i++)  
      {
        if(nums[i]==nums[i-1])
        c++;
        else
        c=1;
        if(c<=2)
        {
            nums[d]=nums[i];
            d++;
        }
      }
    return d;

      
    }
}