class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String w:words)
        {
        
                if(w.contains(pref) && w.indexOf(pref)==0)
                c++;
            
        }
        return c;
    }
}