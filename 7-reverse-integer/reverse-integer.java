class Solution {
    public int reverse(int x) {
       long r=0;
       while(x!=0) 
       {
        int a=x%10;
        r=r*10+a;
        x/=10;
       
       if( r>=Integer.MAX_VALUE|| r<=Integer.MIN_VALUE)
       return 0;
       }
       return (int)r;
    }
}