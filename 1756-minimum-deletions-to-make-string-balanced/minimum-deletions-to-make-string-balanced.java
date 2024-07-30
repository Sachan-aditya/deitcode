class Solution {
    public int minimumDeletions(String s) {
        int res = 0, bCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else {
                res = Math.min(res + 1, bCount);
            }
        }
        return res;
    }
}