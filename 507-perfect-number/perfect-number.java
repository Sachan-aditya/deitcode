class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        int nums=num;
        for(int i=1;i<nums;i++)
        {
        if(nums%i==0)
        s+=i;
        }
        if(s==num)
        return true;
        else
        return false;
    }
}