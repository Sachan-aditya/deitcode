class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-2;j++)
            {
                if(arr[j]%2!=0 && arr[j+1]%2!=0 && arr[j+2]%2!=0)
                 return true;
            }

        }
                    return false;
    }
}