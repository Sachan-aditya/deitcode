class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;int ans=-1;
        int e=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>e)
            e=piles[i];
        }
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isvalid(piles,mid,h))
            {
                ans=mid;
                e=mid-1;
            }
            else
            s=mid+1;
        }
        return ans;
        }
    public boolean isvalid(int piles[],int minspeed,int hours)
    {
        int hs=0;
        for(int i=0;i<piles.length;i++)
        {
          hs+=piles[i]/minspeed;
           if((piles[i]%minspeed)!=0)
           hs+=1;
        
        if(hs>hours)return false;
        }
        return true;
    }
}