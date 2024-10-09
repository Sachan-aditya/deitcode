class Solution {
    public int minAddToMakeValid(String s) {
        int z=0;
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            z++;
            else {
        if (z > 0) 
        z--;
        else
         a++;
            }
        }
             
        return a+z;
    }
}