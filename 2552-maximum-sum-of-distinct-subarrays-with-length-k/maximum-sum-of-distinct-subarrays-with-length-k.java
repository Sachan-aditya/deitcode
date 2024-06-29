class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long runningSum = 0, maxSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int l = 0, r = 0; r < nums.length; r++) {
            if (r - l + 1 > k) {
                set.remove(nums[l]);
                runningSum -= nums[l];
                l++;
            }
            if (!set.contains(nums[r])) {
                runningSum += nums[r];
                set.add(nums[r]);
                if (r - l + 1 == k) {
                    maxSum = Math.max(maxSum, runningSum);
                }
            } else {
                runningSum += nums[r];
                while (set.contains(nums[r]) && l < r) {
                    runningSum -= nums[l];
                    set.remove(nums[l++]);
                }
                set.add(nums[r]);
            }
        }
        return maxSum;       
    }
}