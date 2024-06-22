class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int oddCount = 0;
        int[] prefixCounts = new int[nums.length + 1];
        prefixCounts[0] = 1; // Initialize the prefix count for zero odd numbers.

        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }
            if (oddCount >= k) {
                count += prefixCounts[oddCount - k];
            }
            prefixCounts[oddCount]++;
        }

        return count;
    }
}