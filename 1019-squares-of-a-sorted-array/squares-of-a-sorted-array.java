class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int a[]=new int[nums.length];
        int index=j;
      while(i<=j)
      {
        if(Math.abs(nums[i])>Math.abs(nums[j]))
        {
        a[index]=nums[i]*nums[i];
        index--;
        i++;
        }
        else 
        {
        a[index]=nums[j]*nums[j];
         index--;
        j--;
        }
        
      }
        return a;
    }
}