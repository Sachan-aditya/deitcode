class Solution {
    public int countSeniors(String[] d) {
        String res="";int c=0;
        for(int i=0;i<d.length;i++)
        {
            res=d[i];
        String p=res.substring(11,13);
        if(Integer.parseInt(p)>60)
        c++;
    }
    return c;
    }
}