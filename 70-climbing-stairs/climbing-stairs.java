class Solution {
    public int climbStairs(int n) {
   
      if(n<=2)  
      return n;
         int prev=1;
      int prev2=1;
      for(int i=2;i<=n;i++)
      {
        int temp=prev+prev2;
        prev2=prev;
        prev=temp;
      }
      return prev;
    }
}