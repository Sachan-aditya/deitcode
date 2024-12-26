class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=0;
        for(int i:nums)//2211122
        {
            if(i==candidate)//2//2//1//1
            count++;//1//2//3//4//5
            else
            count--;//3
            if(count==0)//1//2
            {
                candidate=i;//1//2
                count++;//2//4
            }

        }
        return candidate;
    }
}