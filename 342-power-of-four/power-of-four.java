class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int x = (int) (Math.log(n) / Math.log(4));
        return Math.pow(4, x) == n;
    }
}