class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> rmap=new HashMap<>();
        String []w=s.split(" ");
        if(pattern.length()!=w.length)
        return false;
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String p=w[i];
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(p))
                return false;
            }
            else
            map.put(c,p);

            if(rmap.containsKey(p))
            {
                if(rmap.get(p)!=c)
                return false;
            }
            else
            rmap.put(p,c);
        }

return true;
    }
}