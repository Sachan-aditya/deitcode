class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                windowSum -= nums[left];
                left++;
            }
            
            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        
        return maxSum;
    }
}