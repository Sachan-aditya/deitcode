class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
       int n=s.length();
       int ans=0;
       int left=0;
       for(int right=0;right<n;right++)
       { 
        char c=s.charAt(right);
        while(set.contains(c))
        {
        set.remove(s.charAt(left));
        left++;
        }
        set.add(c);
        ans=Math.max(ans,right-left+1);
       }
       return ans;
    }
}