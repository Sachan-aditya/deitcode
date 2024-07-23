class Solution {
    public int[] replaceElements(int[] ar) {
        int max=-1;
        for(int i=ar.length-1;i>=0;i--)
        {
            int c=ar[i];//1
            ar[i]=max;//-1
            if(c>max)
            max=c;//6
        }
        return ar;
        
    }
}