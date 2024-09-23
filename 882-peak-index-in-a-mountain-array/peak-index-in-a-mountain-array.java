class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;//010
            int next=(mid-1+arr.length)%arr.length;
            int prev=(mid+1)%arr.length;
            if(arr[mid]>=arr[prev] &&arr[mid]>=arr[next] )
            return mid;
            else if(arr[mid]>arr[next])
            l=mid+1;     
            else
            r=mid-1;
        }
        return 1;
    }
}