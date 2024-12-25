class Solution {
    public int lengthOfLastWord(String s) {
        int r=s.length()-1;int c=0;
        while(r>=0 && s.charAt(r)==' ')
        {
            r--;
        }
        while(r>=0 && s.charAt(r)!=' '){
            c++;
            r--;
        }
        return c;
    }
}