class Solution {
    public int minimumDeletions(String s) {
        int res = 0, b= 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                b++;
            } else {
                res = Math.min(res + 1, b);
            }
        }
        return res;
    }
}