class Solution {
    public int searchInsert(int[] ar, int target) {
        int left=0;
        int right=ar.length-1;
      
    while(left<=right){ int mid=(left+right)/2;
        if(target==ar[mid])
        return mid;
        else if(target<ar[mid])
        right=mid-1;
        else
        left=mid+1;
     }
     return left;
    }
}