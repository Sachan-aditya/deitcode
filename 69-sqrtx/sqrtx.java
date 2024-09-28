class Solution {
    public int mySqrt(int x) {
       if(x==0)
       return 0;
       long let=x;
       while (let*let>x)
       {
         let=(int)((let+x/let)*0.5);
       }
       return (int)let;
    }
}