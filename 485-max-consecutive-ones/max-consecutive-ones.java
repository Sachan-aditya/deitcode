class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p=0;int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
           if(i==1)
           p++;
           else
           {
            max=Math.max(max,p);
            p=0;
           }
           
        }
        max=Math.max(max,p);
        return max;
    }
}