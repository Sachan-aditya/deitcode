class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=binarysearchf(nums, target);
        int last=binarysearchl(nums,target);
        int res[]=new int[2];
        res[0]=first;
        res[1]=last;
        return res;

    }
    public int binarysearchf(int []nums,int target)
    {
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e)
    {
        int mid=s+(e-s)/2;
    if(nums[mid]==target)
    {
        ans=mid;
        e=mid-1;
    }
    else if(nums[mid]<target)
    {
        s=mid+1;
    }
    else
    e=mid-1;
    }
    return ans;
    }
     public int binarysearchl(int []nums,int target)
    {
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e)
    {
        int mid=s+(e-s)/2;
    if(nums[mid]==target)
    {
        ans=mid;
        s=mid+1;
    }
    else if(nums[mid]<target)
    {
        s=mid+1;
    }
    else
    e=mid-1;
    }
    return ans;
    }
}