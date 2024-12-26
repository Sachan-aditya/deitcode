class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> maps=new HashMap<>();
        HashMap<Character,Character> mapt=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char cs=s.charAt(i);
            char ct=t.charAt(i);
          if(maps.containsKey(cs))
          {
            if(maps.get(cs)!=ct)
            return false;
          }
            else
            maps.put(cs,ct);
          
           if(mapt.containsKey(ct))
          {
            if(mapt.get(ct)!=cs)
            return false;
          }
            else
            mapt.put(ct,cs);
        }
        return true;
    }
}