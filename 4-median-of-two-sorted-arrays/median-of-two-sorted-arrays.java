class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int median[]=new int[n+m];int j=0;
        for(int i:nums1)
        {
            median[j]=i;
            j++;
        }
         for(int i:nums2)
        {
            median[j]=i;
            j++;
        }
        Arrays.sort(median);
        if((m+n)%2==0)
        {
            return (median[(n+m)/2-1]+median[(m+n)/2])/2.0;
        }
        else
       return  median[(n+m)/2];
        
    }
}