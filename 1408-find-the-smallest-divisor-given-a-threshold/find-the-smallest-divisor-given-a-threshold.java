class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s=1;
        int e=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>e)
            {
                e=i;
            }
        }
        int res=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isDivisor(nums,mid,threshold))
            {
                res=mid;
                e=mid-1;
            }
            else
            s=mid+1;
        }
        return res;
    }
    boolean isDivisor(int []nums,int mid,int threshold)
    {
        int s=0;
        for(int i:nums)
        {
            s+=i/mid;
            if(i%mid!=0)
            s++;
        }
        if(s>threshold)
        return false;
        else
        return true;
    }
}