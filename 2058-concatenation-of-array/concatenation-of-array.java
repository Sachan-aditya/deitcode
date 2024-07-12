class Solution {
    public int[] getConcatenation(int[] n) {
        int ar[]=new int[2*(n.length)]; int j=0;
        for(int i=0;i<ar.length;i++)
        { 
            if(n.length>i)//3>012
            {
            ar[i]=n[i];//121
            }
            else
            ar[i]=n[j++];

        }
        return  ar;
    }
}