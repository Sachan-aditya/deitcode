class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
         int max=0;
        int z=-1;
    for(int i=0;i<prices.length;i++)
    {
        if(prices[i]<min)
        min=prices[i];
        else
        max=(int)(Math.max(max,(prices[i]-min)));
        
    }
    return max;
}
}