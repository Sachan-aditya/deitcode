class Solution {
    public boolean isIsomorphic(String s, String t) {
        int count[]=new int[256];
        int count2[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(count[c1]!=count2[c2])
            return false;
            count[c1]=i+1;
            count2[c2]=i+1;
        }
        return true;
    }
}