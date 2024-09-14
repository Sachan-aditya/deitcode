class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            boolean even=true;
            if((r-mid)%2==0)
            even=true;
            else
            even=false;
            if(nums[mid]==nums[mid+1])
            {
                if(even)
                 l=mid+2;
                else
                r=mid-1;

            }
            else
            if(even)
            r=mid;
            else
            l=mid+1;
        }
        return nums[r];
    }
}