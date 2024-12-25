class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        int e=0;
         if (s.length() != t.length()) {
            return false;
        }
        for(char x:t.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char p:s.toCharArray())
        {
            if(map.containsKey(p)){
            map.put(p,map.get(p)-1);
            if(map.get(p)==0)
            map.remove(p);
            }
            else
            return false;
        
        }
       return map.isEmpty();
    }

}