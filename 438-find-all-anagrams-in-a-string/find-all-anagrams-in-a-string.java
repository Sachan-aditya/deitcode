class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list=new ArrayList<>();
     int m1[]=new int[26];
     int m2[]=new int[26];
     if (s.length() < p.length()) return list;
     for(int i=0;i<p.length();i++)
     {
        m1[p.charAt(i)-'a']++;
     }for(int i=0;i<s.length();i++)
     {
        m2[s.charAt(i)-'a']++;
            if (i >= p.length()) {
                m2[s.charAt(i - p.length()) - 'a']--;
            }

            if (i >= p.length() - 1 && isMatched(m1, m2)) {
               list.add(i-p.length()+1);
            }
        }
        return list;
    }
    private boolean isMatched(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) 
                return false;
        }
        return true;
    }
}
     
