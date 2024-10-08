import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {//15
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int result = Integer.MAX_VALUE;
        result = Math.min(result, nums[n-1] - nums[3]);
        result = Math.min(result, nums[n-2] - nums[2]);
        result = Math.min(result, nums[n-3] - nums[1]);
        result = Math.min(result, nums[n-4] - nums[0]);

        return result;
    }
}
