class Solution {
    public String reverseWords(String s) {
        String []p=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=p.length-1;i>=0;i--)
        {
            sb.append(p[i]);
            if(i>0)
            sb.append(" ");
        }
        return sb.toString();
    }
}