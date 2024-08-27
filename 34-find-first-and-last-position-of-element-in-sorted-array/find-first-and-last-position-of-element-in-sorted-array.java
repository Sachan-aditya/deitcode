class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=booleanfirst(nums, target,true);
        int last=booleanlast(nums, target,true);
        int res[]=new int[2];
        res[0]=first;
        res[1]=last;
    return res;
        
    }
    public int booleanfirst(int []nums,int target,boolean ifirst)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
       
        while(start<=end)
        { int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
              
            if(ifirst){
              ans=mid;
            end=mid-1;}
            else
            start=mid+1;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return ans;
    }
       public int booleanlast(int []nums,int target,boolean last)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
          
        while(start<=end)
        { int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
            if(last){
              ans=mid;
             start=mid+1;}
            else
           end=mid-1;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return ans;
    }
}