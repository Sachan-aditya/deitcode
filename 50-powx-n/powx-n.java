class Solution {
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
     double res=1.0;
        while(n!=0)
        {
            if(n%2!=0)
            res=res*x;
        n/=2;
        x=x*x;
        }
        return res;
    }
}