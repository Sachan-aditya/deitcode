class Solution {
    public double averageWaitingTime(int[][] customers) {
        int s=0;
        long avg=0;
        for(int []i:customers)
        {
        int a=i[0];
        int t=i[1];
        if(s<a)
        s=a;
        
        int w=s+t-a;
        avg+=w;
        s+=t;
        }
        return (double) avg/customers.length;
    }
}