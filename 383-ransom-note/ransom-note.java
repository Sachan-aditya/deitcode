class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int bool[]=new int[26];
        for(char c:magazine.toCharArray())
        {
            bool[c-'a']++;
        }
        for(char c:ransomNote.toCharArray())
        {
            if(bool[c-'a']==0)
            return false;
        
        bool[c-'a']--;
        }
        return true;
    }
}