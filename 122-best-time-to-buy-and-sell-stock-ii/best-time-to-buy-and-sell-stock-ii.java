class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;int d=-1;
        int s=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            s+=prices[i]-prices[i-1];
           
            
        }
        return s;
    }
}