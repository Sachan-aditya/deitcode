import java.util.StringTokenizer;

class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        StringTokenizer st = new StringTokenizer(s);
        String lastWord = "";

        while (st.hasMoreTokens()) {
            lastWord = st.nextToken();
        }

        return lastWord.length();
    }
}
