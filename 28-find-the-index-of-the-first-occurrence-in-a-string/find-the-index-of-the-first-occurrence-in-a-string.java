class Solution {
    public int strStr(String haystack, String needle) {
        int p=haystack.indexOf(needle);
        if(p<0)
        return -1;
        else
        return p;
    }
}