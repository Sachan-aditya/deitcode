class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char []p=s.toCharArray();
            Arrays.sort(p);
            String key=new String(p);
            if(!map.containsKey(key))
            map.put(key,new ArrayList<>());

            map.get(key).add(s);
        }
    return new ArrayList<>(map.values());
    }
}