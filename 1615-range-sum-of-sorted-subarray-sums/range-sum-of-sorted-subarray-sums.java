class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int s = 0;
        int p = 0;
        int c[] = new int[n * (n + 1) / 2];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                c[p++] = sum;
            }
        }
        Arrays.sort(c);
        for (int l = left - 1; l < right; l++) {
            s = (s + c[l]) % 1000000007;
        }
        return s;
    }
}