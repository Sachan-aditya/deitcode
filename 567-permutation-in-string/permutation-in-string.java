class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) 
            return false;
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        for (int i = 0; i < n; i++) {
            map1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            map2[s2.charAt(i) - 'a']++;

            if (i >= n) {
                map2[s2.charAt(i - n) - 'a']--;
            }

            if (i >= n - 1 && isMatched(map1, map2)) {
                return true;
            }
        }
        return false;
    }
    private boolean isMatched(int[] map1, int[] map2) {
        for (int i = 0; i < 26; i++) {
            if (map1[i] != map2[i]) 
                return false;
        }
        return true;
    }
}
