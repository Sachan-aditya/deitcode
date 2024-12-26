class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map[]=new int[256];//egg
        int map2[]=new int[256];//ade
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);//e//g//g
            char c2=t.charAt(i);//a//d//e
            if(map[c1]!=map2[c2])//1!=2
            return false;
            map[c1]=i+1;//map[e]=1//map[g]=2
            map2[c2]=i+1;//map[a]=1//map[d]=2
        }
        return true;
    }
}