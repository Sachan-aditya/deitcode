class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
           if(n==1)
           return 0;
        int max=0;
        int current=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,i+nums[i]);
            if(i==current){
            c++;
            current=max;
            }
            if(current>=n-1)
            break;
        }
        return c;
    }
}