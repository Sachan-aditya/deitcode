class Solution {
    public int countSeniors(String[] d) {
       int c=0;
        for(String i:d)
        {
        
        if(Integer.parseInt(i.substring(11,13))>60)
        c++;
    }
    return c;
    }
}