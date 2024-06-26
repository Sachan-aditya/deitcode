class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += max + i;
        }
        return sum;
    }
}
