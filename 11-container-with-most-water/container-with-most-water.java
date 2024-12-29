class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;//8
        int max=0;
        while(left<right)
        {
            //area=length*breadth;//8*1=8//
            int area=(right-left)*Math.min(height[left],height[right]);
            max=Math.max(max,area);//8
            if(height[left]<height[right])
            left++;//1
            else
            right--;
        }
        return max;
    }
}