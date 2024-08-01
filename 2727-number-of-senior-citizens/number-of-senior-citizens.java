class Solution {
    public int countSeniors(String[] d) {
       int c=0;
        for(String i:d)
        {
        String p=i.substring(11,13);
        if(Integer.parseInt(p)>60)
        c++;
    }
    return c;
    }
}