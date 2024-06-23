public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int maxLen = 0;
        int left = 0;
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();

        for (int right = 0; right < nums.length; right++) {
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] < nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] > nums[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);

            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                if (maxDeque.peekFirst() == left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() == left) {
                    minDeque.pollFirst();
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}