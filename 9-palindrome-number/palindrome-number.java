class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;int rev=0;
        while(temp>0)
        {
            int a=temp%10;
            rev=rev*10+a;
            temp/=10;
        }
        if(rev==x)
        return true;
        else
        return false;
    }
}