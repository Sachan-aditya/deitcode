class Solution {
    public int differenceOfSums(int n, int m) {
        int p=0;int s=0;
        for(int i=0;i<=n;i++)
        {
            if(i%m!=0)
            s+=i;
            else
            p+=i;
        }
        return s-p;
    }
}