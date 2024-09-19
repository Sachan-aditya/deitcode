class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; 
        boolean a[]=new boolean[n];
        Arrays.fill(a,true);
        int p=2;
        while(p*p<=n){
            if(a[p]){
        for(int i=p*p;i<n;i+=p)
        {
            a[i]=false;
        }
        }
        p++;
        }
        int c=0;
       for(int i=2;i<n;i++)
       {
        if(a[i])
        c++;
       }
       return c;
    }
}