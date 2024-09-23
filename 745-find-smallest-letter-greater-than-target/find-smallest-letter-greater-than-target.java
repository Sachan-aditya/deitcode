class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;char c='$';
        int r=letters.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(letters[mid]<=target)
            {
               l=mid+1;
                 
            }
            else{
        r=mid-1;
        c=letters[mid];
        }
        }
        if(c=='$')
        return letters[0];
        else
        return c;
    }
}