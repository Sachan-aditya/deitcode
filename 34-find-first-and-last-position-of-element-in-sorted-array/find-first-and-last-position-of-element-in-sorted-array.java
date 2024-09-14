class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        a[0]=left(nums,target);
        a[1]=right(nums,target);
        return a;
    }
    public int left(int []arr,int target)
    {
        int l=0;int index=-1;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                index=mid;
                r=mid-1;
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            r=mid-1;
        }
        return index;
    }
    public  int right(int []arr,int target)
    {
        int l=0;int index=-1;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
            {
                index=mid;
                l=mid+1;//3
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            r=mid-1;
        }
        return index;
    }
}