class Solution {
    public int findMin(int[] ar) {
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=ar.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(ar[mid]>ar[right]){
            left=mid+1;
            }
            else
            right=mid;
        }
        return ar[right];
    }
}