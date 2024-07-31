class Solution {
    public int[] productExceptSelf(int[] n) {
        int []res=new int[n.length];
        Arrays.fill(res,1);
        int pre=1;
        int post=1;
        for(int i=0;i<n.length;i++)
        {
            res[i]=pre;
            pre*=n[i];

        }
        for(int i=n.length-1;i>=0;i--)
        {
            res[i]*=post;
            post*=n[i];

        }
        return res;
    }
}