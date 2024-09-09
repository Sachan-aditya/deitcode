class Solution {
    public boolean searchMatrix(int[][] ar, int target) {
        int l=0;
        int r=ar[0].length-1;
        while(l < ar.length && r >= 0)
        {
            if(ar[l][r]==target)
            return true;
            else if(ar[l][r]<target)
            l++;
            else
            r--;


        }
        return false;
    }
}