class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i:nums)//01223042
        {
            if(i!=val){
            nums[c]=i;
            c++;
            }
        }
        return c;
    }
}