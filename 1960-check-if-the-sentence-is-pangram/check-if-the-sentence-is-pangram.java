class Solution {
    public boolean checkIfPangram(String s) {
boolean ar[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            ar[s.charAt(i)-'a']=true;

        }
        for(boolean c:ar)
        {
        if(!c)
        return false;
        }
    
    return true;
}}