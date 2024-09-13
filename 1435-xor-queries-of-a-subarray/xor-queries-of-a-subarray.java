class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[]=new int[queries.length];
      
            for(int i=0;i<queries.length;i++)
            {  int p=0;
                int l=queries[i][0];//00
                int r=queries[i][1];//01
                for(int j=l;j<=r;j++)
                {
                   p^=arr[j];
                }
            a[i]=p;
            }

        return a;
    }
}