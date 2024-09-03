class Solution {
    public int countPrimes(int n) {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
    
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(prime[i])
            count++;
            for(int j=2*i;j<n;j=j+i)
            {
                prime[j]=false;
            }
        }
        return count;
    }
}