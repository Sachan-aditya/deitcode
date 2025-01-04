class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++)
        {
             char window=s.charAt(right);
            while(set.contains(window))
            {
               set.remove(s.charAt(left));
               left++;

            }
            set.add(window);
            max=Math.max(max,right-left+1);
          
            
        }
        return max;
    }
}