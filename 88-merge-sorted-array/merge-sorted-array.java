class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;//last of num1
        int j=n-1;//last of num2
        int k=m+n-1;//5
        while(j>=0)//123000 //256//2>=0//
        {
            if(i>=0 && nums1[i]>nums2[j])//2>=0 3<6
            {
                nums1[k--]=nums1[i--];//nums[5]=6
            }
            else
            nums1[k--]=nums2[j--];

        }
    }
}