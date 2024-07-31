class Solution {
    public String longestCommonPrefix(String[] st) {
        if(st==null || st.length==0)
        return "";
                String s=st[0];
                for(int i=1;i<st.length;i++)
                {
                    while(st[i].indexOf(s)!=0)
                    {
                    s=s.substring(0,s.length()-1);
                    if(s.isEmpty())
                    return "";
                    }
                }
            return s;
    }
}