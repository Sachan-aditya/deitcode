class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }
            if (nums[i] == (queue.size() % 2)) {
                if (i + k > n) {
                    return -1;
                }
                res++;
                queue.offer(i);
            }
        }
        return res;
    }
}