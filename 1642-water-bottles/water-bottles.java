class Solution {
    public int numWaterBottles(int nb, int ne) {
        int p=nb;
        while(nb>=ne)
        {
            int d=nb/ne;
            int res=nb%ne;
            p+=d;
            nb=d+res;
        }
 
      return p;  
    }
}